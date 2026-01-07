{
  "filepath": "/tmp/Codec-2b/src/java/org/apache/commons/codec/binary/Base64OutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64OutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterOutputStream"
      ],
      "begin_line": 43,
      "end_line": 180,
      "comment": "\r\n * Provides Base64 encoding and decoding in a streaming fashion (unlimited size).\r\n * When encoding the default lineLength is 76 characters and the default\r\n * lineEnding is CRLF, but these can be overridden by using the appropriate\r\n * constructor.\r\n * \u003cp\u003e\r\n * The default behaviour of the Base64OutputStream is to ENCODE, whereas the\r\n * default behaviour of the Base64InputStream is to DECODE.  But this behaviour\r\n * can be overridden by using a different constructor.\r\n * \u003c/p\u003e\u003cp\u003e\r\n * This class implements section \u003ccite\u003e6.8. Base64 Content-Transfer-Encoding\u003c/cite\u003e from RFC 2045 \u003ccite\u003eMultipurpose\r\n * Internet Mail Extensions (MIME) Part One: Format of Internet Message Bodies\u003c/cite\u003e by Freed and Borenstein.\r\n * \u003c/p\u003e\r\n *\r\n * @author Apache Software Foundation\r\n * @version $Id $\r\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\r\n * @since 1.0-dev\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "doEncode"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "base64"
      ],
      "begin_line": 45,
      "end_line": 45,
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
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.Base64OutputStream(java.io.OutputStream)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\r\n     * Creates a Base64OutputStream such that all data written is Base64-encoded\r\n     * to the original provided OutputStream.\r\n     *\r\n     * @param out OutputStream to wrap.\r\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.Base64OutputStream(java.io.OutputStream, boolean)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\r\n     * Creates a Base64OutputStream such that all data written is either\r\n     * Base64-encoded or Base64-decoded to the original provided OutputStream.\r\n     *\r\n     * @param out      OutputStream to wrap.\r\n     * @param doEncode true if we should encode all data written to us,\r\n     *                 false if we should decode.\r\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 19)",
        "(line 68,col 9)-(line 68,col 33)",
        "(line 69,col 9)-(line 69,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.Base64OutputStream(java.io.OutputStream, boolean, int, byte[])",
      "begin_line": 88,
      "end_line": 92,
      "comment": "\r\n     * Creates a Base64OutputStream such that all data written is either\r\n     * Base64-encoded or Base64-decoded to the original provided OutputStream.\r\n     *\r\n     * @param out           OutputStream to wrap.\r\n     * @param doEncode      true if we should encode all data written to us,\r\n     *                      false if we should decode.\r\n     * @param lineLength    If doEncode is true, each line of encoded\r\n     *                      data will contain lineLength characters.  \r\n     *                      If lineLength \u003c\u003d0, the encoded data is not divided into lines.\r\n     *                      If doEncode is false, lineLength is ignored.\r\n     * @param lineSeparator If doEncode is true, each line of encoded\r\n     *                      data will be terminated with this byte sequence (e.g. \\r\\n).  \r\n     *                      If lineLength \u003c\u003d 0, the lineSeparator is not used.\r\n     *                      If doEncode is false lineSeparator is ignored.\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 19)",
        "(line 90,col 9)-(line 90,col 33)",
        "(line 91,col 9)-(line 91,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.write(int)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\r\n     * Writes the specified \u003ccode\u003ebyte\u003c/code\u003e to this output stream.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 33)",
        "(line 99,col 9)-(line 99,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.write(byte[], int, int)",
      "begin_line": 115,
      "end_line": 130,
      "comment": "\r\n     * Writes \u003ccode\u003elen\u003c/code\u003e bytes from the specified\r\n     * \u003ccode\u003eb\u003c/code\u003e array starting at \u003ccode\u003eoffset\u003c/code\u003e to\r\n     * this output stream.\r\n     *\r\n     * @param b source byte array\r\n     * @param offset where to start reading the bytes\r\n     * @param len maximum number of bytes to write\r\n     * \r\n     * @throws IOException if an I/O error occurs.\r\n     * @throws NullPointerException if the byte array parameter is null\r\n     * @throws IndexOutOfBoundsException if offset, len or buffer size are invalid\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.flush(boolean)",
      "begin_line": 141,
      "end_line": 153,
      "comment": "\r\n     * Flushes this output stream and forces any buffered output bytes\r\n     * to be written out to the stream.  If propogate is true, the wrapped\r\n     * stream will also be flushed.\r\n     *\r\n     * @param propogate boolean flag to indicate whether the wrapped\r\n     *                  OutputStream should also be flushed.\r\n     * @throws IOException if an I/O error occurs.\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 35)",
        "(line 143,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.flush()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\r\n     * Flushes this output stream and forces any buffered output bytes\r\n     * to be written out to the stream.\r\n     *\r\n     * @throws IOException if an I/O error occurs.\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.close()",
      "begin_line": 169,
      "end_line": 178,
      "comment": "\r\n     * Closes this output stream and releases any system resources\r\n     * associated with the stream.\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 16)",
        "(line 177,col 9)-(line 177,col 20)"
      ]
    }
  ]
}