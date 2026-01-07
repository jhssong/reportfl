{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 21,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byte[], boolean)",
      "begin_line": 32,
      "end_line": 57,
      "comment": "\n     * Converts a byte array to a long. Halfwords can be swaped with setting\n     * swapHalfWord\u003dtrue.\n     * \n     * @param number\n     *            An array of bytes containing a number\n     * @param swapHalfWord\n     *            Swap halfwords ([0][1][2][3]-\u003e[1][0][3][2])\n     * @return The long value\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 21)",
        "(line 34,col 9)-(line 34,col 20)",
        "(line 35,col 9)-(line 35,col 52)",
        "(line 36,col 9)-(line 36,col 66)",
        "(line 38,col 9)-(line 40,col 9)",
        "(line 42,col 9)-(line 49,col 9)",
        "(line 51,col 9)-(line 51,col 35)",
        "(line 52,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray(long, int, boolean)",
      "begin_line": 71,
      "end_line": 97,
      "comment": "\n     * Converts a byte array to a long. Halfwords can be swaped with setting\n     * swapHalfWord\u003dtrue.\n     * \n     * @param number\n     *            An array of bytes containing a number\n     * @param length\n     *            The length of the returned array\n     * @param swapHalfWord\n     *            Swap halfwords ([0][1][2][3]-\u003e[1][0][3][2])\n     * @return The long value\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 38)",
        "(line 74,col 9)-(line 74,col 20)",
        "(line 75,col 9)-(line 75,col 28)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 81,col 28)",
        "(line 82,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 19)"
      ]
    }
  ]
}