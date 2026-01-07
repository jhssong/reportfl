{
  "filepath": "/tmp/Codec-10b/src/java/org/apache/commons/codec/binary/BaseNCodecOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseNCodecOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterOutputStream"
      ],
      "begin_line": 29,
      "end_line": 141,
      "comment": "\n * Common base class for Base-N output streams.\n * \n * @since 1.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "doEncode"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseNCodec"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singleByte"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.BaseNCodecOutputStream(java.io.OutputStream, org.apache.commons.codec.binary.BaseNCodec, boolean)",
      "begin_line": 37,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 19)",
        "(line 39,col 9)-(line 39,col 37)",
        "(line 40,col 9)-(line 40,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.write(int)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Writes the specified \u003ccode\u003ebyte\u003c/code\u003e to this output stream.\n     * \n     * @param i\n     *            source byte\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 33)",
        "(line 53,col 9)-(line 53,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.write(byte[], int, int)",
      "begin_line": 74,
      "end_line": 89,
      "comment": "\n     * Writes \u003ccode\u003elen\u003c/code\u003e bytes from the specified \u003ccode\u003eb\u003c/code\u003e array starting at \u003ccode\u003eoffset\u003c/code\u003e to this\n     * output stream.\n     * \n     * @param b\n     *            source byte array\n     * @param offset\n     *            where to start reading the bytes\n     * @param len\n     *            maximum number of bytes to write\n     * \n     * @throws IOException\n     *             if an I/O error occurs.\n     * @throws NullPointerException\n     *             if the byte array parameter is null\n     * @throws IndexOutOfBoundsException\n     *             if offset, len or buffer size are invalid\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.flush(boolean)",
      "begin_line": 100,
      "end_line": 112,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes to be written out to the stream. If propogate is\n     * true, the wrapped stream will also be flushed.\n     * \n     * @param propogate\n     *            boolean flag to indicate whether the wrapped OutputStream should also be flushed.\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 43)",
        "(line 102,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.flush()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes to be written out to the stream.\n     * \n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.close()",
      "begin_line": 130,
      "end_line": 139,
      "comment": "\n     * Closes this output stream and releases any system resources associated with the stream.\n     * \n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 16)",
        "(line 138,col 9)-(line 138,col 20)"
      ]
    }
  ]
}