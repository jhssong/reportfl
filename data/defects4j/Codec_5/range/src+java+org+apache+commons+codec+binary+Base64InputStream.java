{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/binary/Base64InputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64InputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 46,
      "end_line": 174,
      "comment": "\n * Provides Base64 encoding and decoding in a streaming fashion (unlimited size). When encoding the default lineLength\n * is 76 characters and the default lineEnding is CRLF, but these can be overridden by using the appropriate\n * constructor.\n * \u003cp\u003e\n * The default behaviour of the Base64InputStream is to DECODE, whereas the default behaviour of the Base64OutputStream\n * is to ENCODE, but this behaviour can be overridden by using a different constructor.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class implements section \u003ccite\u003e6.8. Base64 Content-Transfer-Encoding\u003c/cite\u003e from RFC 2045 \u003ccite\u003eMultipurpose\n * Internet Mail Extensions (MIME) Part One: Format of Internet Message Bodies\u003c/cite\u003e by Freed and Borenstein.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Since this class operates directly on byte streams, and not character streams, it is hard-coded to only encode/decode\n * character encodings which are compatible with the lower 127 ASCII chart (ISO-8859-1, Windows-1252, UTF-8, etc).\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation \n * @version $Id$\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "doEncode"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "base64"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singleByte"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64InputStream.Base64InputStream(java.io.InputStream)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Creates a Base64InputStream such that all data read is Base64-decoded from the original provided InputStream.\n     * \n     * @param in\n     *            InputStream to wrap.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64InputStream.Base64InputStream(java.io.InputStream, boolean)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * Creates a Base64InputStream such that all data read is either Base64-encoded or Base64-decoded from the original\n     * provided InputStream.\n     * \n     * @param in\n     *            InputStream to wrap.\n     * @param doEncode\n     *            true if we should encode all data read from us, false if we should decode.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 18)",
        "(line 75,col 9)-(line 75,col 33)",
        "(line 76,col 9)-(line 76,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64InputStream.Base64InputStream(java.io.InputStream, boolean, int, byte[])",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * Creates a Base64InputStream such that all data read is either Base64-encoded or Base64-decoded from the original\n     * provided InputStream.\n     * \n     * @param in\n     *            InputStream to wrap.\n     * @param doEncode\n     *            true if we should encode all data read from us, false if we should decode.\n     * @param lineLength\n     *            If doEncode is true, each line of encoded data will contain lineLength characters (rounded down to\n     *            nearest multiple of 4). If lineLength \u003c\u003d0, the encoded data is not divided into lines. If doEncode is\n     *            false, lineLength is ignored.\n     * @param lineSeparator\n     *            If doEncode is true, each line of encoded data will be terminated with this byte sequence (e.g. \\r\\n).\n     *            If lineLength \u003c\u003d 0, the lineSeparator is not used. If doEncode is false lineSeparator is ignored.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 18)",
        "(line 97,col 9)-(line 97,col 33)",
        "(line 98,col 9)-(line 98,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStream.read()",
      "begin_line": 108,
      "end_line": 117,
      "comment": "\n     * Reads one \u003ccode\u003ebyte\u003c/code\u003e from this input stream.\n     * \n     * @return the byte as an integer in the range 0 to 255. Returns -1 if EOF has been reached.\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 39)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStream.read(byte[], int, int)",
      "begin_line": 138,
      "end_line": 164,
      "comment": "\n     * Attempts to read \u003ccode\u003elen\u003c/code\u003e bytes into the specified \u003ccode\u003eb\u003c/code\u003e array starting at \u003ccode\u003eoffset\u003c/code\u003e\n     * from this InputStream.\n     * \n     * @param b\n     *            destination byte array\n     * @param offset\n     *            where to start writing the bytes\n     * @param len\n     *            maximum number of bytes to read\n     * \n     * @return number of bytes read\n     * @throws IOException\n     *             if an I/O error occurs.\n     * @throws NullPointerException\n     *             if the byte array parameter is null\n     * @throws IndexOutOfBoundsException\n     *             if offset, len or buffer size are invalid\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStream.markSupported()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @return false\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 21)"
      ]
    }
  ]
}