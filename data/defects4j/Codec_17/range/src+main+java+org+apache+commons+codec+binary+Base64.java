{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/binary/Base64.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.binary.BaseNCodec"
      ],
      "begin_line": 54,
      "end_line": 785,
      "comment": "\n * Provides Base64 encoding and decoding as defined by \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e.\n *\n * \u003cp\u003e\n * This class implements section \u003ccite\u003e6.8. Base64 Content-Transfer-Encoding\u003c/cite\u003e from RFC 2045 \u003ccite\u003eMultipurpose\n * Internet Mail Extensions (MIME) Part One: Format of Internet Message Bodies\u003c/cite\u003e by Freed and Borenstein.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The class can be parameterized in the following manner with various constructors:\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003eURL-safe mode: Default off.\u003c/li\u003e\n * \u003cli\u003eLine length: Default 76. Line length that aren\u0027t multiples of 4 will still essentially end up being multiples of\n * 4 in the encoded data.\n * \u003cli\u003eLine separator: Default is CRLF (\"\\r\\n\")\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * The URL-safe parameter is only applied to encode operations. Decoding seamlessly handles both modes.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Since this class operates directly on byte streams, and not character streams, it is hard-coded to only\n * encode/decode character encodings which are compatible with the lower 127 ASCII chart (ISO-8859-1, Windows-1252,\n * UTF-8, etc).\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class is thread-safe.\n * \u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BITS_PER_ENCODED_BYTE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * BASE32 characters are 6 bits in length.\n     * They are formed by taking a block of 3 octets to form a 24-bit string,\n     * which is converted into 4 BASE64 characters.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BYTES_PER_UNENCODED_BLOCK"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTES_PER_ENCODED_BLOCK"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHUNK_SEPARATOR"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Chunk separator per RFC 2045 section 2.1.\n     *\n     * \u003cp\u003e\n     * N.B. The next major release may break compatibility and make this field private.\n     * \u003c/p\u003e\n     *\n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 2.1\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STANDARD_ENCODE_TABLE"
      ],
      "begin_line": 83,
      "end_line": 89,
      "comment": "\n     * This array is a lookup table that translates 6-bit positive integer index values into their \"Base64 Alphabet\"\n     * equivalents as specified in Table 1 of RFC 2045.\n     *\n     * Thanks to \"commons\" project in ws.apache.org for this code.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "URL_SAFE_ENCODE_TABLE"
      ],
      "begin_line": 96,
      "end_line": 102,
      "comment": "\n     * This is a copy of the STANDARD_ENCODE_TABLE above, but with + and /\n     * changed to - and _ to make the encoded Base64 results more URL-SAFE.\n     * This table is only used when the Base64\u0027s mode is set to URL-SAFE.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DECODE_TABLE"
      ],
      "begin_line": 115,
      "end_line": 125,
      "comment": "\n     * This array is a lookup table that translates Unicode characters drawn from the \"Base64 Alphabet\" (as specified\n     * in Table 1 of RFC 2045) into their 6-bit positive integer equivalents. Characters that are not in the Base64\n     * alphabet but fall within the bounds of the array are translated to -1.\n     *\n     * Note: \u0027+\u0027 and \u0027-\u0027 both decode to 62. \u0027/\u0027 and \u0027_\u0027 both decode to 63. This means decoder seamlessly handles both\n     * URL_SAFE and STANDARD base64. (The encoder, on the other hand, needs to know ahead of time what to emit).\n     *\n     * Thanks to \"commons\" project in ws.apache.org for this code.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_6BITS"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Mask used to extract 6 bits, used when encoding "
    },
    {
      "type": "field",
      "varNames": [
        "encodeTable"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": "\n     * Encode table to use: either STANDARD or URL_SAFE. Note: the DECODE_TABLE above remains static because it is able\n     * to decode both STANDARD and URL_SAFE streams, but the encodeTable must be a member variable so we can switch\n     * between the two modes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decodeTable"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " Only one decode table currently; keep for consistency with Base32 code"
    },
    {
      "type": "field",
      "varNames": [
        "lineSeparator"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": "\n     * Line separator for encoding. Not used when decoding. Only used if lineLength \u0026gt; 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decodeSize"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of room and needs resizing.\n     * \u003ccode\u003edecodeSize \u003d 3 + lineSeparator.length;\u003c/code\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encodeSize"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of room and needs resizing.\n     * \u003ccode\u003eencodeSize \u003d 4 + lineSeparator.length;\u003c/code\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length is 0 (no chunking), and the encoding table is STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(boolean)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in the given URL-safe mode.\n     * \u003cp\u003e\n     * When encoding the line length is 76, the line separator is CRLF, and the encoding table is STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     *\n     * @param urlSafe\n     *            if \u003ccode\u003etrue\u003c/code\u003e, URL-safe encoding is used. In most cases this should be set to\n     *            \u003ccode\u003efalse\u003c/code\u003e.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int)",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length is given in the constructor, the line separator is CRLF, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     *\n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of\n     *            4). If lineLength \u0026lt;\u003d 0, then the output will not be divided into lines (chunks). Ignored when\n     *            decoding.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int, byte[])",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length and line separator are given in the constructor, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     *\n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of\n     *            4). If lineLength \u0026lt;\u003d 0, then the output will not be divided into lines (chunks). Ignored when\n     *            decoding.\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @throws IllegalArgumentException\n     *             Thrown when the provided lineSeparator included some base64 characters.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int, byte[], boolean)",
      "begin_line": 274,
      "end_line": 299,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length and line separator are given in the constructor, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     *\n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of\n     *            4). If lineLength \u0026lt;\u003d 0, then the output will not be divided into lines (chunks). Ignored when\n     *            decoding.\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @param urlSafe\n     *            Instead of emitting \u0027+\u0027 and \u0027/\u0027 we emit \u0027-\u0027 and \u0027_\u0027 respectively. urlSafe is only applied to encode\n     *            operations. Decoding seamlessly handles both modes.\n     *            \u003cb\u003eNote: no padding is added when using the URL-safe alphabet.\u003c/b\u003e\n     * @throws IllegalArgumentException\n     *             The provided lineSeparator included some base64 characters. That\u0027s not going to work!\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 277,col 66)",
        "(line 280,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 46)",
        "(line 298,col 9)-(line 298,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isUrlSafe()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * Returns our current encode mode. True if we\u0027re URL-SAFE, false otherwise.\n     *\n     * @return true if we\u0027re in URL-SAFE mode, false otherwise.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(byte[], int, int, org.apache.commons.codec.binary.BaseNCodec.Context)",
      "begin_line": 332,
      "end_line": 402,
      "comment": "\n     * \u003cp\u003e\n     * Encodes all of the provided data, starting at inPos, for inAvail bytes. Must be called at least twice: once with\n     * the data to encode, and once with inAvail set to \"-1\" to alert encoder that EOF has been reached, to flush last\n     * remaining bytes (if not multiple of 3).\n     * \u003c/p\u003e\n     * \u003cp\u003e\u003cb\u003eNote: no padding is added when encoding using the URL-safe alphabet.\u003c/b\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Thanks to \"commons\" project in ws.apache.org for the bitwise operations, and general approach.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     * \u003c/p\u003e\n     *\n     * @param in\n     *            byte[] array of binary data to base64 encode.\n     * @param inPos\n     *            Position to start reading data from.\n     * @param inAvail\n     *            Amount of bytes available from input for encoding.\n     * @param context\n     *            the context to be used\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 9)",
        "(line 339,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(byte[], int, int, org.apache.commons.codec.binary.BaseNCodec.Context)",
      "begin_line": 429,
      "end_line": 485,
      "comment": "\n     * \u003cp\u003e\n     * Decodes all of the provided data, starting at inPos, for inAvail bytes. Should be called at least twice: once\n     * with the data to decode, and once with inAvail set to \"-1\" to alert decoder that EOF has been reached. The \"-1\"\n     * call is not necessary when decoding, but it doesn\u0027t hurt, either.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Ignores all non-base64 characters. This is how chunked (e.g. 76 character) data is handled, since CR and LF are\n     * silently ignored, but has implications for other bytes, too. This method subscribes to the garbage-in,\n     * garbage-out philosophy: it will not check the provided data for validity.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Thanks to \"commons\" project in ws.apache.org for the bitwise operations, and general approach.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     * \u003c/p\u003e\n     *\n     * @param in\n     *            byte[] array of ascii data to base64 decode.\n     * @param inPos\n     *            Position to start reading data from.\n     * @param inAvail\n     *            Amount of bytes available from input for encoding.\n     * @param context\n     *            the context to be used\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 457,col 9)",
        "(line 462,col 9)-(line 484,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isArrayByteBase64(byte[])",
      "begin_line": 497,
      "end_line": 500,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the Base64 alphabet. Currently the\n     * method treats whitespace as valid.\n     *\n     * @param arrayOctet\n     *            byte array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all bytes are valid characters in the Base64 alphabet or if the byte array is empty;\n     *         \u003ccode\u003efalse\u003c/code\u003e, otherwise\n     * @deprecated 1.5 Use {@link #isBase64(byte[])}, will be removed in 2.0.\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isBase64(byte)",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\n     * Returns whether or not the \u003ccode\u003eoctet\u003c/code\u003e is in the base 64 alphabet.\n     *\n     * @param octet\n     *            The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the value is defined in the the base 64 alphabet, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isBase64(java.lang.String)",
      "begin_line": 524,
      "end_line": 526,
      "comment": "\n     * Tests a given String to see if it contains only valid characters within the Base64 alphabet. Currently the\n     * method treats whitespace as valid.\n     *\n     * @param base64\n     *            String to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all characters in the String are valid characters in the Base64 alphabet or if\n     *         the String is empty; \u003ccode\u003efalse\u003c/code\u003e, otherwise\n     *  @since 1.5\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isBase64(byte[])",
      "begin_line": 538,
      "end_line": 545,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the Base64 alphabet. Currently the\n     * method treats whitespace as valid.\n     *\n     * @param arrayOctet\n     *            byte array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all bytes are valid characters in the Base64 alphabet or if the byte array is empty;\n     *         \u003ccode\u003efalse\u003c/code\u003e, otherwise\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[])",
      "begin_line": 554,
      "end_line": 556,
      "comment": "\n     * Encodes binary data using the base64 algorithm but does not chunk the output.\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return byte[] containing Base64 characters in their UTF-8 representation.\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64String(byte[])",
      "begin_line": 569,
      "end_line": 571,
      "comment": "\n     * Encodes binary data using the base64 algorithm but does not chunk the output.\n     *\n     * NOTE:  We changed the behaviour of this method from multi-line chunking (commons-codec-1.4) to\n     * single-line non-chunking (commons-codec-1.5).\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return String containing Base64 characters.\n     * @since 1.4 (NOTE:  1.4 chunked the output, whereas 1.5 does not).\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byte[])",
      "begin_line": 582,
      "end_line": 584,
      "comment": "\n     * Encodes binary data using a URL-safe variation of the base64 algorithm but does not chunk the output. The\n     * url-safe variation emits - and _ instead of + and / characters.\n     * \u003cb\u003eNote: no padding is added.\u003c/b\u003e\n     * @param binaryData\n     *            binary data to encode\n     * @return byte[] containing Base64 characters in their UTF-8 representation.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byte[])",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\n     * Encodes binary data using a URL-safe variation of the base64 algorithm but does not chunk the output. The\n     * url-safe variation emits - and _ instead of + and / characters.\n     * \u003cb\u003eNote: no padding is added.\u003c/b\u003e\n     * @param binaryData\n     *            binary data to encode\n     * @return String containing Base64 characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byte[])",
      "begin_line": 606,
      "end_line": 608,
      "comment": "\n     * Encodes binary data using the base64 algorithm and chunks the encoded output into 76 character blocks\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return Base64 characters chunked in 76 character blocks\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean)",
      "begin_line": 621,
      "end_line": 623,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     *\n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean, boolean)",
      "begin_line": 640,
      "end_line": 642,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     *\n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @param urlSafe\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will emit - and _ instead of the usual + and / characters.\n     *            \u003cb\u003eNote: no padding is added when encoding using the URL-safe alphabet.\u003c/b\u003e\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean, boolean, int)",
      "begin_line": 661,
      "end_line": 679,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     *\n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @param urlSafe\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will emit - and _ instead of the usual + and / characters.\n     *            \u003cb\u003eNote: no padding is added when encoding using the URL-safe alphabet.\u003c/b\u003e\n     * @param maxResultSize\n     *            The maximum result size to accept.\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than maxResultSize\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 665,col 9)",
        "(line 669,col 9)-(line 669,col 101)",
        "(line 670,col 9)-(line 670,col 58)",
        "(line 671,col 9)-(line 676,col 9)",
        "(line 678,col 9)-(line 678,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeBase64(java.lang.String)",
      "begin_line": 692,
      "end_line": 694,
      "comment": "\n     * Decodes a Base64 String into octets.\n     * \u003cp\u003e\n     * \u003cb\u003eNote:\u003c/b\u003e this method seamlessly handles data encoded in URL-safe or normal mode.\n     * \u003c/p\u003e\n     *\n     * @param base64String\n     *            String containing Base64 data\n     * @return Array containing decoded data.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeBase64(byte[])",
      "begin_line": 706,
      "end_line": 708,
      "comment": "\n     * Decodes Base64 data into octets.\n     * \u003cp\u003e\n     * \u003cb\u003eNote:\u003c/b\u003e this method seamlessly handles data encoded in URL-safe or normal mode.\n     * \u003c/p\u003e\n     *\n     * @param base64Data\n     *            Byte array containing Base64 data\n     * @return Array containing decoded data.\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeInteger(byte[])",
      "begin_line": 721,
      "end_line": 723,
      "comment": "\n     * Decodes a byte64-encoded integer according to crypto standards such as W3C\u0027s XML-Signature.\n     *\n     * @param pArray\n     *            a byte array containing base64 character data\n     * @return A BigInteger\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeInteger(java.math.BigInteger)",
      "begin_line": 735,
      "end_line": 740,
      "comment": "\n     * Encodes to a byte64-encoded integer according to crypto standards such as W3C\u0027s XML-Signature.\n     *\n     * @param bigInt\n     *            a BigInteger\n     * @return A byte array containing base64 character data\n     * @throws NullPointerException\n     *             if null is passed in\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 736,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 739,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.toIntegerBytes(java.math.BigInteger)",
      "begin_line": 749,
      "end_line": 771,
      "comment": "\n     * Returns a byte-array representation of a \u003ccode\u003eBigInteger\u003c/code\u003e without sign bit.\n     *\n     * @param bigInt\n     *            \u003ccode\u003eBigInteger\u003c/code\u003e to be converted\n     * @return a byte array representation of the BigInteger parameter\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 40)",
        "(line 752,col 9)-(line 752,col 42)",
        "(line 753,col 9)-(line 753,col 53)",
        "(line 755,col 9)-(line 757,col 9)",
        "(line 759,col 9)-(line 759,col 25)",
        "(line 760,col 9)-(line 760,col 34)",
        "(line 763,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 767,col 46)",
        "(line 768,col 9)-(line 768,col 57)",
        "(line 769,col 9)-(line 769,col 74)",
        "(line 770,col 9)-(line 770,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isInAlphabet(byte)",
      "begin_line": 780,
      "end_line": 783,
      "comment": "\n     * Returns whether or not the \u003ccode\u003eoctet\u003c/code\u003e is in the Base64 alphabet.\n     *\n     * @param octet\n     *            The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the value is defined in the the Base64 alphabet \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 84)"
      ]
    }
  ]
}