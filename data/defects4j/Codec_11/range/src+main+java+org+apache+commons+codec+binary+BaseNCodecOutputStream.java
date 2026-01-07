{
  "filepath": "/tmp/Codec-11b/src/main/java/org/apache/commons/codec/binary/BaseNCodecOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseNCodecOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterOutputStream"
      ],
      "begin_line": 29,
      "end_line": 145,
      "comment": "\n * Abstract superclass for Base-N output streams.\n * \n * @since 1.5\n "
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
      "end_line": 55,
      "comment": "\n     * Writes the specified \u003ccode\u003ebyte\u003c/code\u003e to this output stream.\n     * \n     * @param i\n     *            source byte\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 33)",
        "(line 54,col 9)-(line 54,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.write(byte[], int, int)",
      "begin_line": 75,
      "end_line": 91,
      "comment": "\n     * Writes \u003ccode\u003elen\u003c/code\u003e bytes from the specified \u003ccode\u003eb\u003c/code\u003e array starting at \u003ccode\u003eoffset\u003c/code\u003e to this\n     * output stream.\n     * \n     * @param b\n     *            source byte array\n     * @param offset\n     *            where to start reading the bytes\n     * @param len\n     *            maximum number of bytes to write\n     * \n     * @throws IOException\n     *             if an I/O error occurs.\n     * @throws NullPointerException\n     *             if the byte array parameter is null\n     * @throws IndexOutOfBoundsException\n     *             if offset, len or buffer size are invalid\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.flush(boolean)",
      "begin_line": 102,
      "end_line": 114,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes to be written out to the stream. If propogate is\n     * true, the wrapped stream will also be flushed.\n     * \n     * @param propogate\n     *            boolean flag to indicate whether the wrapped OutputStream should also be flushed.\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 43)",
        "(line 104,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.flush()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes to be written out to the stream.\n     * \n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.close()",
      "begin_line": 133,
      "end_line": 143,
      "comment": "\n     * Closes this output stream and releases any system resources associated with the stream.\n     * \n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 16)",
        "(line 142,col 9)-(line 142,col 20)"
      ]
    }
  ]
}