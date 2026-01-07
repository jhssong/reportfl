{
  "filepath": "/tmp/Compress-15b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 106,
      "comment": "\n * Package private utility class for Cpio\n * \n * @Immutable\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byte[], boolean)",
      "begin_line": 38,
      "end_line": 63,
      "comment": "\n     * Converts a byte array to a long. Halfwords can be swapped by setting\n     * swapHalfWord\u003dtrue.\n     * \n     * @param number\n     *            An array of bytes containing a number\n     * @param swapHalfWord\n     *            Swap halfwords ([0][1][2][3]-\u003e[1][0][3][2])\n     * @return The long value\n     * @throws UnsupportedOperationException if number length is not a multiple of 2\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 41,col 9)",
        "(line 43,col 9)-(line 43,col 21)",
        "(line 44,col 9)-(line 44,col 20)",
        "(line 45,col 9)-(line 45,col 52)",
        "(line 46,col 9)-(line 46,col 66)",
        "(line 48,col 9)-(line 55,col 9)",
        "(line 57,col 9)-(line 57,col 35)",
        "(line 58,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray(long, int, boolean)",
      "begin_line": 79,
      "end_line": 105,
      "comment": "\n     * Converts a long number to a byte array \n     * Halfwords can be swapped by setting swapHalfWord\u003dtrue.\n     * \n     * @param number \n     *            the input long number to be converted\n     * \n     * @param length\n     *            The length of the returned array\n     * @param swapHalfWord\n     *            Swap halfwords ([0][1][2][3]-\u003e[1][0][3][2])\n     * @return The long value\n     * @throws UnsupportedOperationException if the length is not a positive multiple of two\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 38)",
        "(line 82,col 9)-(line 82,col 20)",
        "(line 83,col 9)-(line 83,col 28)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 28)",
        "(line 90,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 19)"
      ]
    }
  ]
}