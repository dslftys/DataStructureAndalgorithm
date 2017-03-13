package SwordOffer.problem20;

import SwordOffer.node.*;
/*
 * 
 * ˳ʱ���ӡ����
 */
public class PrintMastrix {
	public void printMatrixByClockWise(int[][] a) {
        if (null == a || a.length <= 0) {
            return;
        }
        int row = a.length - 1;
        int column = a[0].length - 1;

        for (int i = 0; 2 * i <= row && 2 * i <= column; i++) {
            printOneCircle(a, i, row - i, column - i);
        }
    }

    private void printOneCircle(int[][] a, int start, int row, int column) {

        // �����Ҵ�ӡһ��
        for (int i = start; i <= column; i++) {
            System.out.println(a[start][i]);
        }

        // �������´�ӡһ��
        if (start == row) {
            return;
        }
        for (int i = start + 1; i <= row; i++) {
            System.out.println(a[i][column]);
        }

        // ���������ӡһ��
        if (start == column) {
            return;
        }
        for (int i = column - 1; i >= start; i--) {
            System.out.println(a[row][i]);
        }

        // �������ϴ�ӡһ��
        for (int i = row - 1; i >= start + 1; i--) {
            System.out.println(a[i][start]);
        }
    }
}
