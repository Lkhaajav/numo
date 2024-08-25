package numo.common.constants;

public class FormatStrings {
    // ����� �б⿡ ���� �⺻ ��¥�ð� ����
    public static String DEFAULT_HUMAN_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    // ��й�ȣ ���� ����� �����ͺ��̽� �⺻ ����
    // INFO: SQL���� char(8) ������ �÷��� sysdate ���� timastamp �����͸� �Ҵ��ϸ� 'yy/MM/dd' �������� ��ȯ�ؼ� ��������
    // INFO: SELECT VALUE FROM NLS_SESSION_PARAMETERS WHERE PARAMETER = 'NLS_DATE_FORMAT'; ���� Ȯ�� ����
    public static String DEFAULT_PWD_CHANGE_YMD_FORMAT = "yy/MM/dd";
}
