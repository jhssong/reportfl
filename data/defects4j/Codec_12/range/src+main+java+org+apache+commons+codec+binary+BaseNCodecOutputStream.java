{
  "filepath": "/tmp/Codec-12b/src/main/java/org/apache/commons/codec/binary/BaseNCodecOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseNCodecOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterOutputStream"
      ],
      "begin_line": 31,
      "end_line": 147,
      "comment": "\n * Abstract superclass for Base-N output streams.\n * \n * @since 1.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "doEncode"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseNCodec"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singleByte"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.BaseNCodecOutputStream(java.io.OutputStream, org.apache.commons.codec.binary.BaseNCodec, boolean)",
      "begin_line": 39,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 19)",
        "(line 41,col 9)-(line 41,col 37)",
        "(line 42,col 9)-(line 42,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.write(int)",
      "begin_line": 53,
      "end_line": 57,
      "comment": "\n     * Writes the specified \u003ccode\u003ebyte\u003c/code\u003e to this output stream.\n     * \n     * @param i\n     *            source byte\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 33)",
        "(line 56,col 9)-(line 56,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.write(byte[], int, int)",
      "begin_line": 77,
      "end_line": 93,
      "comment": "\n     * Writes \u003ccode\u003elen\u003c/code\u003e bytes from the specified \u003ccode\u003eb\u003c/code\u003e array starting at \u003ccode\u003eoffset\u003c/code\u003e to this\n     * output stream.\n     * \n     * @param b\n     *            source byte array\n     * @param offset\n     *            where to start reading the bytes\n     * @param len\n     *            maximum number of bytes to write\n     * \n     * @throws IOException\n     *             if an I/O error occurs.\n     * @throws NullPointerException\n     *             if the byte array parameter is null\n     * @throws IndexOutOfBoundsException\n     *             if offset, len or buffer size are invalid\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.flush(boolean)",
      "begin_line": 104,
      "end_line": 116,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes to be written out to the stream. If propogate is\n     * true, the wrapped stream will also be flushed.\n     * \n     * @param propogate\n     *            boolean flag to indicate whether the wrapped OutputStream should also be flushed.\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 43)",
        "(line 106,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.flush()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes to be written out to the stream.\n     * \n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.close()",
      "begin_line": 135,
      "end_line": 145,
      "comment": "\n     * Closes this output stream and releases any system resources associated with the stream.\n     * \n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 16)",
        "(line 144,col 9)-(line 144,col 20)"
      ]
    }
  ]
}