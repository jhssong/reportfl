{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/binary/BaseNCodecOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseNCodecOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterOutputStream"
      ],
      "begin_line": 40,
      "end_line": 176,
      "comment": "\n * Abstract superclass for Base-N output streams.\n * \u003cp\u003e\n * To write the EOF marker without closing the stream, call {@link #eof()} or use an \u003ca\n * href\u003d\"https://commons.apache.org/proper/commons-io/\"\u003eApache Commons IO\u003c/a\u003e \u003ca href\u003d\n * \"https://commons.apache.org/proper/commons-io/apidocs/org/apache/commons/io/output/CloseShieldOutputStream.html\"\n * \u003eCloseShieldOutputStream\u003c/a\u003e.\n * \u003c/p\u003e\n *\n * @since 1.5\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "doEncode"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseNCodec"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singleByte"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.BaseNCodecOutputStream(java.io.OutputStream, org.apache.commons.codec.binary.BaseNCodec, boolean)",
      "begin_line": 51,
      "end_line": 55,
      "comment": " TODO should this be protected?",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 19)",
        "(line 53,col 9)-(line 53,col 37)",
        "(line 54,col 9)-(line 54,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.write(int)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Writes the specified \u003ccode\u003ebyte\u003c/code\u003e to this output stream.\n     *\n     * @param i\n     *            source byte\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 33)",
        "(line 68,col 9)-(line 68,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.write(byte[], int, int)",
      "begin_line": 89,
      "end_line": 105,
      "comment": "\n     * Writes \u003ccode\u003elen\u003c/code\u003e bytes from the specified \u003ccode\u003eb\u003c/code\u003e array starting at \u003ccode\u003eoffset\u003c/code\u003e to this\n     * output stream.\n     *\n     * @param b\n     *            source byte array\n     * @param offset\n     *            where to start reading the bytes\n     * @param len\n     *            maximum number of bytes to write\n     *\n     * @throws IOException\n     *             if an I/O error occurs.\n     * @throws NullPointerException\n     *             if the byte array parameter is null\n     * @throws IndexOutOfBoundsException\n     *             if offset, len or buffer size are invalid\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.flush(boolean)",
      "begin_line": 116,
      "end_line": 128,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes to be written out to the stream. If propagate is\n     * true, the wrapped stream will also be flushed.\n     *\n     * @param propagate\n     *            boolean flag to indicate whether the wrapped OutputStream should also be flushed.\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 56)",
        "(line 118,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.flush()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes to be written out to the stream.\n     *\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.close()",
      "begin_line": 153,
      "end_line": 158,
      "comment": "\n     * Closes this output stream and releases any system resources associated with the stream.\n     * \u003cp\u003e\n     * To write the EOF marker without closing the stream, call {@link #eof()} or use an\n     * \u003ca href\u003d\"https://commons.apache.org/proper/commons-io/\"\u003eApache Commons IO\u003c/a\u003e \u003ca href\u003d\n     * \"https://commons.apache.org/proper/commons-io/apidocs/org/apache/commons/io/output/CloseShieldOutputStream.html\"\n     * \u003eCloseShieldOutputStream\u003c/a\u003e.\n     * \u003c/p\u003e\n     *\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 14)",
        "(line 156,col 9)-(line 156,col 16)",
        "(line 157,col 9)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.eof()",
      "begin_line": 167,
      "end_line": 174,
      "comment": "\n     * Writes EOF.\n     *\n     * @throws IOException\n     *             if an I/O error occurs.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 173,col 9)"
      ]
    }
  ]
}