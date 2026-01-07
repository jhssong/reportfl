{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/binary/Base64OutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64OutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.binary.BaseNCodecOutputStream"
      ],
      "begin_line": 43,
      "end_line": 88,
      "comment": "\n * Provides Base64 encoding and decoding in a streaming fashion (unlimited size). When encoding the default lineLength\n * is 76 characters and the default lineEnding is CRLF, but these can be overridden by using the appropriate\n * constructor.\n * \u003cp\u003e\n * The default behaviour of the Base64OutputStream is to ENCODE, whereas the default behaviour of the Base64InputStream\n * is to DECODE. But this behaviour can be overridden by using a different constructor.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class implements section \u003ccite\u003e6.8. Base64 Content-Transfer-Encoding\u003c/cite\u003e from RFC 2045 \u003ccite\u003eMultipurpose\n * Internet Mail Extensions (MIME) Part One: Format of Internet Message Bodies\u003c/cite\u003e by Freed and Borenstein.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Since this class operates directly on byte streams, and not character streams, it is hard-coded to only encode/decode\n * character encodings which are compatible with the lower 127 ASCII chart (ISO-8859-1, Windows-1252, UTF-8, etc).\n * \u003c/p\u003e\n *\n * @version $Id$\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @since 1.4\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.Base64OutputStream(java.io.OutputStream)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Creates a Base64OutputStream such that all data written is Base64-encoded to the original provided OutputStream.\n     *\n     * @param out\n     *            OutputStream to wrap.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.Base64OutputStream(java.io.OutputStream, boolean)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Creates a Base64OutputStream such that all data written is either Base64-encoded or Base64-decoded to the\n     * original provided OutputStream.\n     *\n     * @param out\n     *            OutputStream to wrap.\n     * @param doEncode\n     *            true if we should encode all data written to us, false if we should decode.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64OutputStream.Base64OutputStream(java.io.OutputStream, boolean, int, byte[])",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Creates a Base64OutputStream such that all data written is either Base64-encoded or Base64-decoded to the\n     * original provided OutputStream.\n     *\n     * @param out\n     *            OutputStream to wrap.\n     * @param doEncode\n     *            true if we should encode all data written to us, false if we should decode.\n     * @param lineLength\n     *            If doEncode is true, each line of encoded data will contain lineLength characters (rounded down to\n     *            nearest multiple of 4). If lineLength \u0026lt;\u003d 0, the encoded data is not divided into lines. If doEncode is\n     *            false, lineLength is ignored.\n     * @param lineSeparator\n     *            If doEncode is true, each line of encoded data will be terminated with this byte sequence (e.g. \\r\\n).\n     *            If lineLength \u0026lt;\u003d 0, the lineSeparator is not used. If doEncode is false lineSeparator is ignored.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 68)"
      ]
    }
  ]
}