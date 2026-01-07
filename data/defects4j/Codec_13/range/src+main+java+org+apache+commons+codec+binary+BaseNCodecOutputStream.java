{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/binary/BaseNCodecOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseNCodecOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterOutputStream"
      ],
      "begin_line": 34,
      "end_line": 153,
      "comment": "\n * Abstract superclass for Base-N output streams.\n *\n * @since 1.5\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "doEncode"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseNCodec"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singleByte"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.BaseNCodecOutputStream(java.io.OutputStream, org.apache.commons.codec.binary.BaseNCodec, boolean)",
      "begin_line": 45,
      "end_line": 49,
      "comment": " TODO should this be protected?",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 19)",
        "(line 47,col 9)-(line 47,col 37)",
        "(line 48,col 9)-(line 48,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.write(int)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Writes the specified \u003ccode\u003ebyte\u003c/code\u003e to this output stream.\n     *\n     * @param i\n     *            source byte\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 33)",
        "(line 62,col 9)-(line 62,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.write(byte[], int, int)",
      "begin_line": 83,
      "end_line": 99,
      "comment": "\n     * Writes \u003ccode\u003elen\u003c/code\u003e bytes from the specified \u003ccode\u003eb\u003c/code\u003e array starting at \u003ccode\u003eoffset\u003c/code\u003e to this\n     * output stream.\n     *\n     * @param b\n     *            source byte array\n     * @param offset\n     *            where to start reading the bytes\n     * @param len\n     *            maximum number of bytes to write\n     *\n     * @throws IOException\n     *             if an I/O error occurs.\n     * @throws NullPointerException\n     *             if the byte array parameter is null\n     * @throws IndexOutOfBoundsException\n     *             if offset, len or buffer size are invalid\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.flush(boolean)",
      "begin_line": 110,
      "end_line": 122,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes to be written out to the stream. If propagate is\n     * true, the wrapped stream will also be flushed.\n     *\n     * @param propagate\n     *            boolean flag to indicate whether the wrapped OutputStream should also be flushed.\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 56)",
        "(line 112,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.flush()",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes to be written out to the stream.\n     *\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecOutputStream.close()",
      "begin_line": 141,
      "end_line": 151,
      "comment": "\n     * Closes this output stream and releases any system resources associated with the stream.\n     *\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 16)",
        "(line 150,col 9)-(line 150,col 20)"
      ]
    }
  ]
}