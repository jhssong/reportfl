{
  "filepath": "/tmp/Compress-36b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 114,
      "comment": "\n * Package private utility class for Cpio\n * \n * @Immutable\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioUtil.fileType(long)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "\n     * Extracts the file type bits from a mode.\n     ",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byte[], boolean)",
      "begin_line": 46,
      "end_line": 71,
      "comment": "\n     * Converts a byte array to a long. Halfwords can be swapped by setting\n     * swapHalfWord\u003dtrue.\n     * \n     * @param number\n     *            An array of bytes containing a number\n     * @param swapHalfWord\n     *            Swap halfwords ([0][1][2][3]-\u003e[1][0][3][2])\n     * @return The long value\n     * @throws UnsupportedOperationException if number length is not a multiple of 2\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 49,col 9)",
        "(line 51,col 9)-(line 51,col 21)",
        "(line 52,col 9)-(line 52,col 20)",
        "(line 53,col 9)-(line 53,col 58)",
        "(line 54,col 9)-(line 54,col 66)",
        "(line 56,col 9)-(line 63,col 9)",
        "(line 65,col 9)-(line 65,col 35)",
        "(line 66,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray(long, int, boolean)",
      "begin_line": 87,
      "end_line": 113,
      "comment": "\n     * Converts a long number to a byte array \n     * Halfwords can be swapped by setting swapHalfWord\u003dtrue.\n     * \n     * @param number \n     *            the input long number to be converted\n     * \n     * @param length\n     *            The length of the returned array\n     * @param swapHalfWord\n     *            Swap halfwords ([0][1][2][3]-\u003e[1][0][3][2])\n     * @return The long value\n     * @throws UnsupportedOperationException if the length is not a positive multiple of two\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 44)",
        "(line 90,col 9)-(line 90,col 20)",
        "(line 91,col 9)-(line 91,col 28)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 97,col 9)-(line 97,col 28)",
        "(line 98,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 19)"
      ]
    }
  ]
}