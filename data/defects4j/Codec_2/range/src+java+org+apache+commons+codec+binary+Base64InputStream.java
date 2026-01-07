{
  "filepath": "/tmp/Codec-2b/src/java/org/apache/commons/codec/binary/Base64InputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64InputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 43,
      "end_line": 163,
      "comment": "\r\n * Provides Base64 encoding and decoding in a streaming fashion (unlimited size).\r\n * When encoding the default lineLength is 76 characters and the default\r\n * lineEnding is CRLF, but these can be overridden by using the appropriate\r\n * constructor.\r\n * \u003cp\u003e\r\n * The default behaviour of the Base64InputStream is to DECODE, whereas the\r\n * default behaviour of the Base64OutputStream is to ENCODE, but this\r\n * behaviour can be overridden by using a different constructor.\r\n * \u003c/p\u003e\u003cp\u003e\r\n * This class implements section \u003ccite\u003e6.8. Base64 Content-Transfer-Encoding\u003c/cite\u003e from RFC 2045 \u003ccite\u003eMultipurpose\r\n * Internet Mail Extensions (MIME) Part One: Format of Internet Message Bodies\u003c/cite\u003e by Freed and Borenstein.\r\n * \u003c/p\u003e\r\n *\r\n * @author Apache Software Foundation\r\n * @version $Id $\r\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\r\n * @since 1.0-dev\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "doEncode"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "base64"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singleByte"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64InputStream.Base64InputStream(java.io.InputStream)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\r\n     * Creates a Base64InputStream such that all data read is Base64-decoded\r\n     * from the original provided InputStream.\r\n     *\r\n     * @param in InputStream to wrap.\r\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64InputStream.Base64InputStream(java.io.InputStream, boolean)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\r\n     * Creates a Base64InputStream such that all data read is either\r\n     * Base64-encoded or Base64-decoded from the original provided InputStream.\r\n     *\r\n     * @param in       InputStream to wrap.\r\n     * @param doEncode true if we should encode all data read from us,\r\n     *                 false if we should decode.\r\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 18)",
        "(line 69,col 9)-(line 69,col 33)",
        "(line 70,col 9)-(line 70,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64InputStream.Base64InputStream(java.io.InputStream, boolean, int, byte[])",
      "begin_line": 89,
      "end_line": 93,
      "comment": "\r\n     * Creates a Base64InputStream such that all data read is either\r\n     * Base64-encoded or Base64-decoded from the original provided InputStream.\r\n     *\r\n     * @param in            InputStream to wrap.\r\n     * @param doEncode      true if we should encode all data read from us,\r\n     *                      false if we should decode.\r\n     * @param lineLength    If doEncode is true, each line of encoded\r\n     *                      data will contain lineLength characters.\r\n     *                      If lineLength \u003c\u003d0, the encoded data is not divided into lines.\r\n     *                      If doEncode is false, lineLength is ignored.\r\n     * @param lineSeparator If doEncode is true, each line of encoded\r\n     *                      data will be terminated with this byte sequence (e.g. \\r\\n).\r\n     *                      If lineLength \u003c\u003d 0, the lineSeparator is not used.  \r\n     *                      If doEncode is false lineSeparator is ignored.\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 18)",
        "(line 91,col 9)-(line 91,col 33)",
        "(line 92,col 9)-(line 92,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStream.read()",
      "begin_line": 101,
      "end_line": 110,
      "comment": "\r\n     * Reads one \u003ccode\u003ebyte\u003c/code\u003e from this input stream.\r\n     * \r\n     * @return the byte as an integer in the range 0 to 255\r\n     * Returns -1 if EOF has been reached.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 39)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStream.read(byte[], int, int)",
      "begin_line": 126,
      "end_line": 154,
      "comment": "\r\n     * Attempts to read \u003ccode\u003elen\u003c/code\u003e bytes into the specified\r\n     * \u003ccode\u003eb\u003c/code\u003e array starting at \u003ccode\u003eoffset\u003c/code\u003e from\r\n     * this InputStream.\r\n     * \r\n     * @param b destination byte array\r\n     * @param offset where to start writing the bytes\r\n     * @param len maximum number of bytes to read\r\n     * \r\n     * @return number of bytes read\r\n     * @throws IOException if an I/O error occurs.\r\n     * @throws NullPointerException if the byte array parameter is null\r\n     * @throws IndexOutOfBoundsException if offset, len or buffer size are invalid\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStream.markSupported()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\r\n     * {@inheritDoc}\r\n     * @return false\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 21)"
      ]
    }
  ]
}