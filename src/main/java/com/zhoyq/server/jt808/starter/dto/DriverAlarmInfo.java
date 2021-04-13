/*
 *  Copyright (c) 2021. 刘路 All rights reserved
 *  版权所有 刘路 并保留所有权利 2021.
 *  ============================================================================
 *  这不是一个自由软件！您只能在不用于商业目的的前提下对程序代码进行修改和
 *  使用。不允许对程序代码以任何形式任何目的的再发布。如果项目发布携带作者
 *  认可的特殊 LICENSE 则按照 LICENSE 执行，废除上面内容。请保留原作者信息。
 *  ============================================================================
 *  刘路（feedback@zhoyq.com）于 2021. 创建
 *  http://zhoyq.com
 */

package com.zhoyq.server.jt808.starter.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 驾驶员身份信息采集报警
 * @author zhoyq <a href="mailto:feedback@zhoyq.com">feedback@zhoyq.com</a>
 * @date 2020/2/19
 */
@Builder
@Setter
@Getter
public class DriverAlarmInfo {
    /**
     * IC卡拔出
     */
    private boolean pullOutCard;

    /**
     * 密钥认证未通过
     */
    private boolean unAuthentication;

    /**
     * 卡片已经锁定
     */
    private boolean locked;

    /**
     * 卡被拔出 ?
     */
    private boolean pullOut;

    /**
     * 数据校验失败
     */
    private boolean checkFailed;
}
