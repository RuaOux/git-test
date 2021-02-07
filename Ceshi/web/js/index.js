window.addEventListener('load', function() {
    // 获取元素
    var focus = document.querySelector('.focus');
    var arrow_l = focus.querySelector('.arrow-l');
    var arrow_r = focus.querySelector('.arrow-r');
    var ul = focus.querySelector('ul');
    var ol = focus.querySelector('ol');
    // 鼠标经过和离开 显示和隐藏 左右按钮
    focus.addEventListener('mouseover', function() {
        arrow_l.style.display = 'block';
        arrow_r.style.display = 'block';
        clearInterval(timer);
        timer = null;
    });
    focus.addEventListener('mouseout', function() {
        arrow_l.style.display = 'none';
        arrow_r.style.display = 'none';
        timer = setInterval(function() {
            arrow_r.click();
        }, 2000)
    });
    var focusWidth = focus.offsetWidth;
    for (var i = 0; i < ul.children.length; i++) {
        // 创建一个li插入到ol里面
        var li = document.createElement('li');
        // 记录当前小圆圈的索引号 通过自定义属性来做
        li.setAttribute('data-index', i);
        // 把li插入到ol 里面
        ol.appendChild(li);
        // 小圆圈的排他思想 我们可以直接在生成小圆圈的同时直接绑定点击事情
        li.addEventListener('click', function() {
            for (var i = 0; i < ol.children.length; i++) {
                ol.children[i].className = '';
            }
            this.className = 'current';
            // ul 的移动距离 小圆圈的索引号 乘以 图片的宽度 注意是负值
            // 当我们点击了某个小li 的时候 就拿到当前li的索引号
            var index = this.getAttribute('data-index');
            // 当我们点击了li的时候就要把这个索引号给num;
            num = index;
            numm = index;
            animate(ul, -index * focusWidth);
        })
    }
    ol.children[0].className = 'current';
    // 点击右箭头实现页面跳转
    // 每次点击移动的距离是索引号 乘以 图片宽度
    var uli = ul.children[0].cloneNode(true);
    ul.appendChild(uli);
    var num = 0;
    var numm = 0;
    var flag = true;
    // 右侧按钮
    arrow_r.addEventListener('click', function() {
        if (flag) {
            flag = false;
            if (num == ul.children.length - 1) {
                ul.style.left = 0;
                num = 0;
            }
            num++;
            animate(ul, -num * focusWidth, function() {
                flag = true;
            });
            numm++;
            if (numm == ol.children.length) {
                numm = 0;
            }
            circleChange();
        }
    });
    // 左侧按钮
    arrow_l.addEventListener('click', function() {
        if (flag = true) {
            flag = false;
            if (num == 0) {
                ul.style.left = 0;
                num = ul.children.length - 1;
            }
            num--;
            animate(ul, -num * focusWidth, function() {
                flag = true;
            });
            numm--;
            if (numm < 0) {
                numm = ol.children.length - 1;
            }
            circleChange();
        }
    });
    var timer = setInterval(function() {
        arrow_r.click();
    }, 2000)

    function circleChange() {
        for (var i = 0; i < ol.children.length; i++) {
            ol.children[i].className = '';
        }
        ol.children[numm].className = 'current';
    }

    var toolTop = $(".Recommend").offset().top;
    // 给li加上节流阀 等待动画结束后再启动li的current
    var flag = true;
    toggleTool();
    $(window).scroll(function() {
        toggleTool();

    })

    function toggleTool() {
        if (flag) {
            if ($(document).scrollTop() >= toolTop) {
                $(".fixedtool").fadeIn();
            } else {
                $(".fixedtool").fadeOut();
            }
            // 3. 页面滚动到某个内容区域, 左侧电梯导航小li相应添加和删除current类名
            $(".floor .w").each(function(i, ele) {
                if ($(document).scrollTop() >= $(ele).offset().top) {
                    $(".fixedtool li").eq(i).addClass("current").siblings().removeClass();
                }
            })
        }
    }
    // 2. 点击电梯导航页面可以滚动到相应的区域
    $(".fixedtool li").click(function() {
        // 当我们每次点击小li 就需要计算去相应索引号的盒子位置
        flag = false;
        var index = $(this).index();
        var floorTop = $(".floor .w").eq(index).offset().top;
        $("body, html").stop().animate({
            scrollTop: floorTop
        }, function() {
            flag = true;
        })
        $(this).addClass('current').siblings().removeClass();
    })

})