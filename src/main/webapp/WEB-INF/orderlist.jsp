<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/19 0019
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--引入jstl的标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--引入jstl的格式化标签库--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--引入spring的表单标签库--%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>订单管理</title>
    <meta charset="UTF-8"/>
    <base target="_self"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <!-- 引入 Bootstrap -->
    <link href="${app}/static/css/bootstrap.css" rel="stylesheet"/>
    <link href="${app}/static/css/animate.css" rel="stylesheet"/>
    <link href="${app}/static/css/font-awesome.css" rel="stylesheet"/>
    <link href="${app}/static/css/custom.css" rel="stylesheet"/>

    <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
    <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js" rel="external nofollow"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js" rel="external nofollow"></script>
    <![endif]-->
</head>
<body>

<!--提示消息框-->
<div class="alert"></div>
<!-- 模态框 -->
<div class="modal fade" id="addModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">添加新订单</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <!-- 模态框主体 -->
            <div class="modal-body">
                <form method="post" action="${app}/orderlist/opt" class="form-horizontal" role="form">
                    <%--input type="hidden" name="_method" value="POST" /--%>
                        <div class="form-group">
                            <label for="oamountAddInput">amount:</label>
                            <input type="text" class="form-control" id="oamountAddInput" name="oamount"
                                   placeholder="请输入购买数量"/>
                        </div>

                        <div class="form-group">
                            <label for="cpassAddInput">password:</label>
                            <select>
                                <option value="1">已结算</option>
                                <option value="0">未结算</option>
                            </select>
                            <input type="password" class="form-control" id="cpassAddInput" name="cpass"
                                   placeholder="请输入密码">
                        </div>
                        <div class="form-group">
                            <label for="cphoneAddInput">cphone:</label>
                            <input type="text" class="form-control" id="cphoneAddInput" name="cphone"
                                   placeholder="请输入电话">
                        </div>
                        <div class="form-group">
                            <label for="cemailAddInput">cemail:</label>
                            <input type="text" class="form-control" id="cemailAddInput" name="cemail"
                                   placeholder="请输入邮箱">
                        </div>
                        <div class="form-group">
                            <label for="cbirthAddInput">cbirth:</label>
                            <input type="date" class="form-control" id="cbirthAddInput" name="cbirth"
                                   placeholder="请输入生日">
                        </div>
                        <div class="form-group">
                            <label for="cavatarAddInput">cavatar:</label>
                            <img data-my="disAvatar" src="" style="width: 100px;height: 100px;"/>
                            <input style="display: none;" type="file" class="form-control" id="cavatarAddInput"
                                   data-my="inputAvatar" name="file"
                                   placeholder="请输入头像">
                        </div>
                        <div class="form-group">
                            <label for="cgenderAddInput">cgender:</label>
                            <input type="text" class="form-control" id="cgenderAddInput" name="cgender"
                                   placeholder="请输入性别">
                        </div>
                        <div class="form-group">
                            <label for="cstatusAddInput">cstatus:</label>
                            <input type="text" class="form-control" id="cstatusAddInput" name="cstatus"
                                   placeholder="请输入状态">
                        </div>

                    <div class="form-group">
                        <button id="addObjBtn" type="button" class="btn btn-block btn-primary">添加</button>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
            </div>

        </div>
    </div>
</div>

<div class="modal fade" id="updateModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">修改信息</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <!-- 模态框主体 -->
            <div class="modal-body">
                <form method="post" enctype="multipart/form-data" class="form-horizontal" role="form">
                    <input type="hidden" name="_method" value="PUT"/>
                    <div class="form-group">
                        <label for="cidUpdateInput">cid:</label>
                        <input type="text" readonly="readonly" class="form-control" id="cidUpdateInput" name="cid"
                               placeholder="cid"/>
                    </div>
                    <div class="form-group">
                        <label for="cnameUpdateInput">姓名username:</label>
                        <input type="text" readonly="readonly" class="form-control" id="cnameUpdateInput"
                               name="cname"
                               placeholder="请输入用户姓名"/>
                    </div>
                    <div class="form-group">
                        <label for="cpassUpdateInput">密码password:</label>
                        <input type="password" class="form-control" id="cpassUpdateInput" name="cpass"
                               placeholder="请输入新密码">
                    </div>
                    <div class="form-group">
                        <label for="cphoneUpdateInput">cphone:</label>
                        <input type="text" class="form-control" id="cphoneUpdateInput" name="cphone"
                               placeholder="请输入新电话">
                    </div>
                    <div class="form-group">
                        <label for="cemailUpdateInput">cemail:</label>
                        <input type="text" class="form-control" id="cemailUpdateInput" name="cemail"
                               placeholder="请输入新邮箱">
                    </div>
                    <div class="form-group">
                        <label for="cavatarUpdateInput">cavatar:</label>
                        <img data-my="disAvataru" src="" style="width: 100px;height: 100px;"/>
                        <input style="display: none;" type="file" class="form-control" id="cavatarUpdateInput"
                               data-my="inputAvataru" name="file"
                               placeholder="请输入头像">
                    </div>

                    <div class="form-group">
                        <button id="updateObjBtn" type="button" class="btn btn-block btn-primary">修改</button>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
            </div>

        </div>
    </div>
</div>

<form id="searchForm" method="get" action="${app}/customer/list">
    <select id="cidList" name="cidCondition">
        <option selected="selected" value="-1">不限cid</option>
        <option value="0">cid大于</option>
        <option value="1">cid等于</option>
        <option value="2">cid小于</option>
    </select>

    <input name="cid" type="text" value="" placeholder="cid"/>
    <input type="text" placeholder="cname" name="cname" value=""/>
    <input type="date" name="startDate" value="2020-10-01"/>
    <input type="date" name="endDate" value="2020-11-12"/>
    <input class="btn btn-primary" type="button" id="searchBtn" value="查询"/>
</form>
<div>
    <!-- 按钮：用于打开模态框 -->
    <button id="openAddModalBtn" type="button" class="btn btn-primary" data-toggle="modal" data-target="#addModal">新增
    </button>
    <input class="btn btn-danger" type="button" id="deletesBtn" value="删除所选"/>
</div>
<table id="objTable" class="table table-striped table-bordered table-hover">
    <thead>
    <tr class="bg-primary text-white">
        <th>
            <input type="checkbox" id="choiceToggle"/>
            <input class="btn btn-sm btn-warning" type="button" id="reverseBtn" value="反选"/>
        </th>
        <th>序号</th>
        <th>用户id(uid)</th>
        <th>姓名(cname)</th>
        <th>电话(cphone)</th>
        <th>邮箱(cemail)</th>
        <th>密码(cpass)</th>
        <th>生日(cbirth)</th>
        <th>头像(cavatar)</th>
        <th>性别(cgender)</th>
        <th>状态(cstatus)</th>
        <th>创建时间(addTime)</th>
        <th>操作(修改)</th>
        <th>操作(删除)</th>
    </tr>
    </thead>
    <tbody>

    </tbody>
</table>
<div class="row">
    <div id="pageList" class="col-12 col-md-8">

    </div>
    <div id="pageTips" class="col-12 col-md-4">

    </div>
</div>

<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="${app}/static/js/jquery-3.3.1.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="${app}/static/js/bootstrap.js"></script>
<script src="${app}/static/js/vue.js"></script>
<script src="${app}/static/js/vue-resources.js"></script>
<script src="${app}/static/js/vue-router.js"></script>
<script src="${app}/static/js/axios.js"></script>
<script src="${app}/static/js/custom.js"></script>
<script>
    var currentPage=1;
    var maxPages=1;

    $(function () {
        //为了跳转页面方便,设置全局变量保存当前页和最大页码数
        //页面加载时向远端获取所有数据,页面定位在第1页
        gotoPage();
        //页面加载时给全选和反选按钮绑定事件
        mulCheck();
        //给查询按钮绑定事件
        $("#searchBtn").click(search);
        //给删除多条记录的按钮绑定事件
        $("#deletesBtn").click(deleteMuliRecord);
        //给添加按钮绑定事件
        $("#openAddModalBtn").click(addForm);
        //点击添加按钮将新增数据存放到数据库
        $("#addObjBtn").click(addObj);
        //给每条记录的修改按钮添加事件
        $(document).on("click", ".upBtn", updateForm);
        //给修改用户信息的按钮添加事件
        $("#updateObjBtn").click(updateObj);
        //给每条记录的删除按钮添加事件
        $(document).on("click", ".delBtn", deleteSingleRecord);
        //给需要点击之后上传图片的区域添加点击事件,确保能够调用文件域的点击事件
        $('[data-my="disAvatar"]').click(function (eve) {$('[data-my="inputAvatar"]').click();});
        $('[data-my="inputAvatar"]').change(choiceAvatar);

        $('[data-my="disAvataru"]').click(function (eve) {$('[data-my="inputAvataru"]').click();});
        $('[data-my="inputAvataru"]').change(choiceAvataru);
    });

    //修改信息时从远端获取数据并填入表单
    function updateForm(ele) {
        //打开模态框
        $("#updateModal").modal({backdrop: "static"});
        //将表单中原有数据清空
        $("#updateModal form").get(0).reset();
        //从服务器获取信息填入修改表单中
        $.ajax({
            url: ele.target.href,
            type: "GET",
            success: function (result) {
                //回填数据
                $("#cidUpdateInput").val(result.dataZone.obj.cid);
                $("#cnameUpdateInput").val(result.dataZone.obj.cname);
                $("#cphoneUpdateInput").val(result.dataZone.obj.cphone);
                $("#cemailUpdateInput").val(result.dataZone.obj.cemail);
                $('#cavatarUpdateInput [data-my="disAvatariu"]').attr('src',result.dataZone.obj.cavatar);
                $("#addTimeUpdateInput").val(new Date(result.dataZone.obj.addTime).Format("yyyy-MM-dd"));

            },
            error: function () {
            }
        });

        return false;//取消超链接的默认跳转
    }

    function search() {
        //修改数据之前先进行数据校验
        //校验通过向服务器发送请求
        // alert("search被调用了");
        $.ajax({
            //url: "${app}/customer/list?startDate=$("#startDate").val()&endDate=2020-10-13",
            url: "${app}/customer/list",
            type: "GET",
            data: $("#searchForm").serialize(),
            success: function (result) {
                gotoPage();//回到第一页
            },
            error: function (result) {
                alertTips(result.message,"alert-danger");
                return false;
            }
        });
    }

    //提交用户修改的信息
    function updateObj() {
        //修改数据之前先进行数据校验
        //校验通过向服务器发送请求
        var formData = new FormData($("#updateModal form").get(0));
        $.ajax({
            url: "${app}/customer/optu",
            type: "POST",
            data: formData,
            dataType:"json",
            contentType:false,//此处对应head处的文档声明
            processData:false,//取消默认的预处理行为
            success: function (result) {
                $("#updateModal").modal("hide");//关闭模态框
                gotoPage(currentPage);//回到当前页面
                alertTips(result.message,"alert-success");
            },
            error: function (result) {
                alertTips(result.message,"alert-danger");
                return false;
            }
        });
    }

    //打开添加的模态框并清空原有数据
    function addForm() {
        //打开模态框
        $("#addModal").modal({backdrop: "static"});
        //将表单中原有数据清空
        $("#addModal form").get(0).reset();
    }

    function addObj() {
        //添加数据之前先进行数据校验
        //校验通过向服务器发送请求
        var formData = new FormData($("#addModal form").get(0));
        $.ajax({
            url: "${app}/customer/opt",
            type: "POST",
            data: formData,
            dataType:"json",
            contentType:false,//此处对应head处的文档声明
            processData:false,//取消默认的预处理行为
            success: function (result) {
                $("#addModal").modal("hide");//关闭模态框
                gotoPage(maxPages+1);//到最后一页,想想为什么要加1
                alertTips(result.message,"alert-success");
            },
            error: function (result) {
                alertTips(result.message,"alert-danger");
                return false;
            }
        });
    }

    function deleteSingleRecord(ele) {
        //询问是否删除
        if (!confirm("真的删除"))
            return false;
        $.ajax({
            url: ele.target.href,
            type: "DELETE",
            success: function (result) {
                alertTips(result.message,"alert-success");
                gotoPage(currentPage);
            },
            error: function (result) {
                alertTips(result.message,"alert-danger");
            }
        });
        return false;
    }

    function deleteMuliRecord() {
        //点击删除所选按钮时删除多条记录

        var ids = "";//需要传递给服务器的uid列表
        var names = "";//需要显式给操作者看的提示信息列表
        $("[name=choiceList]:checkbox").each(function () {
            if (this.checked) {
                ids += $(this).parents("tr").find("td:eq(0)").text() + "-";//通过 - 连接
                names += $(this).parents("tr").find("td:eq(1)").text() + ",";//通过 , 连接
            }
        });
        ids = ids.substr(0, ids.length - 1);//去掉最后的一个 -
        names = names.substr(0, names.length - 1);//去掉最后的一个 ,
        //询问用户操作
        if (confirm("是否删除" + names + "的记录")) {
            // if(confirm("是否删除uid为"+uids+"的记录")){
            //向服务器发送请求,我们已经使用过get和post方法,这次使用最底层的ajax方法
            $.ajax({
                type: "DELETE",
                url: "${app}/customer/opt/" + ids,
                success: function (result) {
                    // alert(result.message);
                    // $(document).flush();//刷新当前页
                    // window.location.reload();
                    gotoPage(currentPage);
                    alertTips(result.message,"alert-success");
                },
                error: function () {

                }
            });
        }
    }

    function gotoPage(pageNum, pageSize) {
        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 10 : pageSize;
        $.ajax({
            type: "GET",
            url: "${app}/customer/list?pageNum=" + pageNum + "&pageSize=" + pageSize,
            dataType: "json",
            data: $("#searchForm").serialize(),
            success: function (result) {
                // 解析返回的json数据并显示到界面中,封装为函数吧,太多东西了
                currentPage = result.dataZone.pageInfo.pageNum;
                maxPages = result.dataZone.pageInfo.pages;
                parseDataAndShow(result);
                //解析渲染分页条
                parsePageAndShow(result);
            },
            error: function () {
                alert("数据出错,请调试程序");
            }
        });
    }

    function parseDataAndShow(result) {
        $("#objTable tbody").empty();
        // 获取数据集合
        let lists = result.dataZone.pageInfo.list;
        $.each(lists, function (index, item) {
            //构建行
            var uTr = $("<tr></tr>");
            //构建多个单元格
            var checkboxTh = $('<th><input type="checkbox" name="choiceList" value="${item.cid}"/></th>');
            var countTh = $('<th></th>').text(index + 1);
            var td1 = $('<td></td>').text(item.cid);
            var td2 = $('<td></td>').text(item.cname);
            var td3 = $('<td></td>').text(item.cphone);
            var td4 = $('<td></td>').text(item.cemail);
            var td5 = $('<td></td>').text(item.cpass);
            var td6 = $('<td></td>').text(new Date(item.cbirth).Format("yyyy-MM-dd"));
            var td7 = $('<td></td>').text(item.cavatar);
            var td8 = $('<td></td>').text(item.cgender);
            var td9 = $('<td></td>').text(item.cstatus);
            var addTimeTd = $('<td></td>').text(new Date(item.addTime).Format("yyyy-MM-dd HH:mm:ss"));
            var upBtnTd = $('<td></td>').html('<a class="upBtn btn btn-info btn-sm" href="${app}/customer/opt/' + item.cid + '">修改</a>');
            var delBtnTd = $('<td></td>').html('<a class="delBtn btn btn-danger btn-sm" href="${app}/customer/opt/' + item.cid + '">删除</a>');
            //将单元格追加到行中
            uTr.append(checkboxTh).append(countTh).append(td1)
                .append(td2).append(td3).append(td4).append(td5).append(td6)
                .append(td7).append(td8).append(td9).append(addTimeTd)
                .append(upBtnTd).append(delBtnTd);
            // 将行追加到表体中
            $("#objTable tbody").append(uTr);
        });
    }

    function parsePageAndShow(result) {
        //因为是不跨页面的刷新操作,所以操作前先清空当前节点内容
        $("#pageTips").empty();
        $("#pageList").empty();

        var pageInfo = result.dataZone.pageInfo;
        //

        //构建分页信息
        $("#pageTips").html("共" + pageInfo.total + "条记录," + pageInfo.pages + "页,每页" + pageInfo.pageSize + "条");
        //构建分页列表
        var oUl = $("<ul></ul>").addClass("pagination");
        var firstLi = $("<li></li>").addClass("page-item").append($("<a></a>").text("首页").addClass("page-link").attr("href", "#"));
        var preLi = $("<li></li>").addClass("page-item").append($("<a></a>").text("上一页").addClass("page-link").attr("href", "#"));
        if (pageInfo.isFirstPage) {
            firstLi.addClass("disabled");
            preLi.addClass("disabled");
        }
        oUl.append(firstLi).append(preLi);

        $.each(pageInfo.navigatepageNums, function (index, item) {
            var numLi = $("<li></li>").addClass("page-item").append($("<a></a>").text(item).addClass("page-link").attr("href", "#"));
            if (pageInfo.pageNum == item)
                numLi.addClass("active");
            //给页码绑定点击事件,能够跳转页面
            numLi.click(function () {
                gotoPage(item);//跳转到指定页面
            });

            numLi.appendTo(oUl);
        });

        var lastLi = $("<li></li>").addClass("page-item").append($("<a></a>").text("尾页").addClass("page-link").attr("href", "#"));
        var nextLi = $("<li></li>").addClass("page-item").append($("<a></a>").text("下一页").addClass("page-link").attr("href", "#"));
        if (pageInfo.isLastPage) {
            nextLi.addClass("disabled");
            lastLi.addClass("disabled");
        }
        //给其他页码标签绑定事件
        firstLi.click(function () {
            gotoPage(1)
        });
        preLi.click(function () {
            gotoPage(pageInfo.pageNum - 1)
        });
        nextLi.click(function () {
            gotoPage(pageInfo.pageNum + 1)
        });
        lastLi.click(function () {
            gotoPage(pageInfo.pages + 1)
        });//因为设置了分页插件的合理化配置,所以给一个很大的值就会到最后一页
        oUl.append(nextLi).append(lastLi);

        $("#pageList").append(oUl);

        //解除不能点击按钮的事件
        //分页代码中的部分属性点击失去链接属性,因为这是dom刷新后添加的事件,所以取消默认行为已经不好用了
        $(".pagination .disabled,.pagination .active").off("click");

    }

    function mulCheck() {
        //全选和反选的操作
        $("#choiceToggle").click(function () {
            $("[name=choiceList]:checkbox").prop("checked", this.checked);
        });

        //选中所有子项全选被选中
        //因为通过ajax动态生成该复选框组件,所以以前写的绑定代码不能使用
        //通过dom加载的元素绑定事件使用on方法,不了解看第2天的视频
        $(document).on("click", function () {
            var flag = true;
            $("[name=choiceList]:checkbox").each(function () {
                if (!this.checked) {
                    flag = false;
                }
            });
            $("#choiceToggle").prop("checked", flag);
        });
        // $("[name=choiceList]:checkbox").click(function () {
        //     var flag = true;
        //     $("[name=choiceList]:checkbox").each(function () {
        //         if (!this.checked) {
        //             flag = false;
        //         }
        //     });
        //     $("#choiceToggle").prop("checked", flag);
        // });
        //反选操作
        $("#reverseBtn").click(function () {
            $("[name=choiceList]:checkbox").each(function () {
                this.checked = !this.checked;
            });
        });
    }

    //完成后弹出消息框
    function alertTips(message,alert_type){
        $('.alert').html(message).removeAttr("class").addClass(alert_type).show().delay(1000).fadeOut();
    }


    //日期转换
    Date.prototype.Format = function (fmt) { // author: meizz
        var o = {
            "M+": this.getMonth() + 1, // 月份
            "d+": this.getDate(), // 日
            "H+": this.getHours(), // 小时
            "m+": this.getMinutes(), // 分
            "s+": this.getSeconds(), // 秒
            "q+": Math.floor((this.getMonth() + 3) / 3), // 季度
            "S": this.getMilliseconds()
            // 毫秒
        };
        if (/(y+)/.test(fmt))
            fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "")
                .substr(4 - RegExp.$1.length));
        for (var k in o)
            if (new RegExp("(" + k + ")").test(fmt))
                fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k])
                    : (("00" + o[k]).substr(("" + o[k]).length)));
        return fmt;
    };

    function parseISO8601(dateStringInRange) {
        var isoExp = /^\s*(\d{4})-(\d\d)-(\d\d)\s(\d\d):(\d\d)\s*$/, date = new Date(
            NaN), month, hour, min, parts = isoExp.exec(dateStringInRange);

        if (parts) {
            month = +parts[2];
            hour = +parts[4];
            min = +parts[5];
            date.setFullYear(parts[1], month - 1, parts[3]);
            date.setHours(hour, min, 0, 0);
            if (month != date.getMonth() + 1) {
                date.setTime(NaN);
            }
        }
        return date;
    }

    function isValidDate(d) {
        if (Object.prototype.toString.call(d) !== "[object Date]")
            return false;
        return !isNaN(d.getTime());
    }

    //点击图片能够调用 文件域的点击事件

    //文件域的值发生改变,将图片改变
    function choiceAvatar(e){
        var reader = new FileReader();
        reader.onload = (function () {
            return function (e) {
                $('[data-my="disAvatar"]').attr('src',this.result);
            }
        })(e.target.files[0]);
        reader.readAsDataURL(e.target.files[0]);
    };

    function choiceAvataru(e){
        var reader = new FileReader();
        reader.onload = (function () {
            return function (e) {
                $('[data-my="disAvataru"]').attr('src',this.result);
            }
        })(e.target.files[0]);
        reader.readAsDataURL(e.target.files[0]);
    };
</script>
</body>
</html>
