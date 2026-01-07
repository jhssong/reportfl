{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/binary/Base64OutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64OutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterOutputStream"
      ],
      "begin_line": 46,
      "end_line": 198,
      "comment": "\n * Provides Base64 encoding and decoding in a streaming fashion (unlimited size). When encoding the default lineLength\n * is 76 characters and the default lineEnding is CRLF, but these can be overridden by using the appropriate\n * constructor.\n * \u003cp\u003e\n * The default behaviour of the Base64OutputStream is to ENCODE, whereas the default behaviour of the Base64InputStream\n * is to DECODE. But this behaviour can be overridden by using a different constructor.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class implements section \u003ccite\u003e6.8. Base64 Content-Transfer-Encoding\u003c/cite\u003e from RFC 2045 \u003ccite\u003eMultipurpose\n * Internet Mail Extensions (MIME) Part One: Format of Internet Message Bodies\u003c/cite\u003e by Freed and Borenstein.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Since this class operates directly on byte streams, and not character streams, it is hard-coded to only encode/decode\n * character encodings which are compatible with the lower 127 ASCII chart (ISO-8859-1, Windows-1252, UTF-8, etc).\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @version $Id$\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "doEncode"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "base64"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singleByte"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.Base64OutputStream(java.io.OutputStream)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Creates a Base64OutputStream such that all data written is Base64-encoded to the original provided OutputStream.\n     * \n     * @param out\n     *            OutputStream to wrap.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.Base64OutputStream(java.io.OutputStream, boolean)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n     * Creates a Base64OutputStream such that all data written is either Base64-encoded or Base64-decoded to the\n     * original provided OutputStream.\n     * \n     * @param out\n     *            OutputStream to wrap.\n     * @param doEncode\n     *            true if we should encode all data written to us, false if we should decode.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 19)",
        "(line 74,col 9)-(line 74,col 33)",
        "(line 75,col 9)-(line 75,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.Base64OutputStream(java.io.OutputStream, boolean, int, byte[])",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * Creates a Base64OutputStream such that all data written is either Base64-encoded or Base64-decoded to the\n     * original provided OutputStream.\n     * \n     * @param out\n     *            OutputStream to wrap.\n     * @param doEncode\n     *            true if we should encode all data written to us, false if we should decode.\n     * @param lineLength\n     *            If doEncode is true, each line of encoded data will contain lineLength characters (rounded down to\n     *            nearest multiple of 4). If lineLength \u003c\u003d0, the encoded data is not divided into lines. If doEncode is\n     *            false, lineLength is ignored.\n     * @param lineSeparator\n     *            If doEncode is true, each line of encoded data will be terminated with this byte sequence (e.g. \\r\\n).\n     *            If lineLength \u003c\u003d 0, the lineSeparator is not used. If doEncode is false lineSeparator is ignored.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 19)",
        "(line 96,col 9)-(line 96,col 33)",
        "(line 97,col 9)-(line 97,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.write(int)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Writes the specified \u003ccode\u003ebyte\u003c/code\u003e to this output stream.\n     * \n     * @param i\n     *            source byte\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 33)",
        "(line 110,col 9)-(line 110,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.write(byte[], int, int)",
      "begin_line": 131,
      "end_line": 146,
      "comment": "\n     * Writes \u003ccode\u003elen\u003c/code\u003e bytes from the specified \u003ccode\u003eb\u003c/code\u003e array starting at \u003ccode\u003eoffset\u003c/code\u003e to this\n     * output stream.\n     * \n     * @param b\n     *            source byte array\n     * @param offset\n     *            where to start reading the bytes\n     * @param len\n     *            maximum number of bytes to write\n     * \n     * @throws IOException\n     *             if an I/O error occurs.\n     * @throws NullPointerException\n     *             if the byte array parameter is null\n     * @throws IndexOutOfBoundsException\n     *             if offset, len or buffer size are invalid\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.flush(boolean)",
      "begin_line": 157,
      "end_line": 169,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes to be written out to the stream. If propogate is\n     * true, the wrapped stream will also be flushed.\n     * \n     * @param propogate\n     *            boolean flag to indicate whether the wrapped OutputStream should also be flushed.\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 35)",
        "(line 159,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.flush()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes to be written out to the stream.\n     * \n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.close()",
      "begin_line": 187,
      "end_line": 196,
      "comment": "\n     * Closes this output stream and releases any system resources associated with the stream.\n     * \n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 16)",
        "(line 195,col 9)-(line 195,col 20)"
      ]
    }
  ]
}