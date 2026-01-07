{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/binary/Base64.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.binary.BaseNCodec"
      ],
      "begin_line": 51,
      "end_line": 775,
      "comment": "\n * Provides Base64 encoding and decoding as defined by \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e.\n *\n * \u003cp\u003e\n * This class implements section \u003ccite\u003e6.8. Base64 Content-Transfer-Encoding\u003c/cite\u003e from RFC 2045 \u003ccite\u003eMultipurpose\n * Internet Mail Extensions (MIME) Part One: Format of Internet Message Bodies\u003c/cite\u003e by Freed and Borenstein.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The class can be parameterized in the following manner with various constructors:\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003eURL-safe mode: Default off.\u003c/li\u003e\n * \u003cli\u003eLine length: Default 76. Line length that aren\u0027t multiples of 4 will still essentially end up being multiples of\n * 4 in the encoded data.\n * \u003cli\u003eLine separator: Default is CRLF (\"\\r\\n\")\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Since this class operates directly on byte streams, and not character streams, it is hard-coded to only\n * encode/decode character encodings which are compatible with the lower 127 ASCII chart (ISO-8859-1, Windows-1252,\n * UTF-8, etc).\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class is thread-safe.\n * \u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BITS_PER_ENCODED_BYTE"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * BASE32 characters are 6 bits in length.\n     * They are formed by taking a block of 3 octets to form a 24-bit string,\n     * which is converted into 4 BASE64 characters.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BYTES_PER_UNENCODED_BLOCK"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTES_PER_ENCODED_BLOCK"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHUNK_SEPARATOR"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Chunk separator per RFC 2045 section 2.1.\n     *\n     * \u003cp\u003e\n     * N.B. The next major release may break compatibility and make this field private.\n     * \u003c/p\u003e\n     *\n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 2.1\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STANDARD_ENCODE_TABLE"
      ],
      "begin_line": 80,
      "end_line": 86,
      "comment": "\n     * This array is a lookup table that translates 6-bit positive integer index values into their \"Base64 Alphabet\"\n     * equivalents as specified in Table 1 of RFC 2045.\n     *\n     * Thanks to \"commons\" project in ws.apache.org for this code.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "URL_SAFE_ENCODE_TABLE"
      ],
      "begin_line": 93,
      "end_line": 99,
      "comment": "\n     * This is a copy of the STANDARD_ENCODE_TABLE above, but with + and /\n     * changed to - and _ to make the encoded Base64 results more URL-SAFE.\n     * This table is only used when the Base64\u0027s mode is set to URL-SAFE.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DECODE_TABLE"
      ],
      "begin_line": 112,
      "end_line": 120,
      "comment": "\n     * This array is a lookup table that translates Unicode characters drawn from the \"Base64 Alphabet\" (as specified\n     * in Table 1 of RFC 2045) into their 6-bit positive integer equivalents. Characters that are not in the Base64\n     * alphabet but fall within the bounds of the array are translated to -1.\n     *\n     * Note: \u0027+\u0027 and \u0027-\u0027 both decode to 62. \u0027/\u0027 and \u0027_\u0027 both decode to 63. This means decoder seamlessly handles both\n     * URL_SAFE and STANDARD base64. (The encoder, on the other hand, needs to know ahead of time what to emit).\n     *\n     * Thanks to \"commons\" project in ws.apache.org for this code.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_6BITS"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Mask used to extract 6 bits, used when encoding "
    },
    {
      "type": "field",
      "varNames": [
        "encodeTable"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Encode table to use: either STANDARD or URL_SAFE. Note: the DECODE_TABLE above remains static because it is able\n     * to decode both STANDARD and URL_SAFE streams, but the encodeTable must be a member variable so we can switch\n     * between the two modes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decodeTable"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " Only one decode table currently; keep for consistency with Base32 code"
    },
    {
      "type": "field",
      "varNames": [
        "lineSeparator"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": "\n     * Line separator for encoding. Not used when decoding. Only used if lineLength \u0026gt; 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decodeSize"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of room and needs resizing.\n     * \u003ccode\u003edecodeSize \u003d 3 + lineSeparator.length;\u003c/code\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encodeSize"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of room and needs resizing.\n     * \u003ccode\u003eencodeSize \u003d 4 + lineSeparator.length;\u003c/code\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length is 0 (no chunking), and the encoding table is STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(boolean)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in the given URL-safe mode.\n     * \u003cp\u003e\n     * When encoding the line length is 76, the line separator is CRLF, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     *\n     * @param urlSafe\n     *            if {@code true}, URL-safe encoding is used. In most cases this should be set to {@code false}.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length is given in the constructor, the line separator is CRLF, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     *\n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of\n     *            4). If lineLength \u0026lt;\u003d 0, then the output will not be divided into lines (chunks). Ignored when\n     *            decoding.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int, byte[])",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length and line separator are given in the constructor, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     *\n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of\n     *            4). If lineLength \u0026lt;\u003d 0, then the output will not be divided into lines (chunks). Ignored when\n     *            decoding.\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @throws IllegalArgumentException\n     *             Thrown when the provided lineSeparator included some base64 characters.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int, byte[], boolean)",
      "begin_line": 269,
      "end_line": 294,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length and line separator are given in the constructor, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     *\n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of\n     *            4). If lineLength \u0026lt;\u003d 0, then the output will not be divided into lines (chunks). Ignored when\n     *            decoding.\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @param urlSafe\n     *            Instead of emitting \u0027+\u0027 and \u0027/\u0027 we emit \u0027-\u0027 and \u0027_\u0027 respectively. urlSafe is only applied to encode\n     *            operations. Decoding seamlessly handles both modes.\n     *            \u003cb\u003eNote: no padding is added when using the URL-safe alphabet.\u003c/b\u003e\n     * @throws IllegalArgumentException\n     *             The provided lineSeparator included some base64 characters. That\u0027s not going to work!\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 66)",
        "(line 275,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 46)",
        "(line 293,col 9)-(line 293,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isUrlSafe()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * Returns our current encode mode. True if we\u0027re URL-SAFE, false otherwise.\n     *\n     * @return true if we\u0027re in URL-SAFE mode, false otherwise.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(byte[], int, int, org.apache.commons.codec.binary.BaseNCodec.Context)",
      "begin_line": 327,
      "end_line": 397,
      "comment": "\n     * \u003cp\u003e\n     * Encodes all of the provided data, starting at inPos, for inAvail bytes. Must be called at least twice: once with\n     * the data to encode, and once with inAvail set to \"-1\" to alert encoder that EOF has been reached, to flush last\n     * remaining bytes (if not multiple of 3).\n     * \u003c/p\u003e\n     * \u003cp\u003e\u003cb\u003eNote: no padding is added when encoding using the URL-safe alphabet.\u003c/b\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Thanks to \"commons\" project in ws.apache.org for the bitwise operations, and general approach.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     * \u003c/p\u003e\n     *\n     * @param in\n     *            byte[] array of binary data to base64 encode.\n     * @param inPos\n     *            Position to start reading data from.\n     * @param inAvail\n     *            Amount of bytes available from input for encoding.\n     * @param context\n     *            the context to be used\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)",
        "(line 334,col 9)-(line 396,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(byte[], int, int, org.apache.commons.codec.binary.BaseNCodec.Context)",
      "begin_line": 424,
      "end_line": 481,
      "comment": "\n     * \u003cp\u003e\n     * Decodes all of the provided data, starting at inPos, for inAvail bytes. Should be called at least twice: once\n     * with the data to decode, and once with inAvail set to \"-1\" to alert decoder that EOF has been reached. The \"-1\"\n     * call is not necessary when decoding, but it doesn\u0027t hurt, either.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Ignores all non-base64 characters. This is how chunked (e.g. 76 character) data is handled, since CR and LF are\n     * silently ignored, but has implications for other bytes, too. This method subscribes to the garbage-in,\n     * garbage-out philosophy: it will not check the provided data for validity.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Thanks to \"commons\" project in ws.apache.org for the bitwise operations, and general approach.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     * \u003c/p\u003e\n     *\n     * @param in\n     *            byte[] array of ascii data to base64 decode.\n     * @param inPos\n     *            Position to start reading data from.\n     * @param inAvail\n     *            Amount of bytes available from input for encoding.\n     * @param context\n     *            the context to be used\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 453,col 9)",
        "(line 458,col 9)-(line 480,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isArrayByteBase64(byte[])",
      "begin_line": 493,
      "end_line": 496,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the Base64 alphabet. Currently the\n     * method treats whitespace as valid.\n     *\n     * @param arrayOctet\n     *            byte array to test\n     * @return {@code true} if all bytes are valid characters in the Base64 alphabet or if the byte array is empty;\n     *         {@code false}, otherwise\n     * @deprecated 1.5 Use {@link #isBase64(byte[])}, will be removed in 2.0.\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isBase64(byte)",
      "begin_line": 506,
      "end_line": 508,
      "comment": "\n     * Returns whether or not the \u003ccode\u003eoctet\u003c/code\u003e is in the base 64 alphabet.\n     *\n     * @param octet\n     *            The value to test\n     * @return {@code true} if the value is defined in the the base 64 alphabet, {@code false} otherwise.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isBase64(java.lang.String)",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\n     * Tests a given String to see if it contains only valid characters within the Base64 alphabet. Currently the\n     * method treats whitespace as valid.\n     *\n     * @param base64\n     *            String to test\n     * @return {@code true} if all characters in the String are valid characters in the Base64 alphabet or if\n     *         the String is empty; {@code false}, otherwise\n     *  @since 1.5\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isBase64(byte[])",
      "begin_line": 534,
      "end_line": 541,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the Base64 alphabet. Currently the\n     * method treats whitespace as valid.\n     *\n     * @param arrayOctet\n     *            byte array to test\n     * @return {@code true} if all bytes are valid characters in the Base64 alphabet or if the byte array is empty;\n     *         {@code false}, otherwise\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[])",
      "begin_line": 550,
      "end_line": 552,
      "comment": "\n     * Encodes binary data using the base64 algorithm but does not chunk the output.\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return byte[] containing Base64 characters in their UTF-8 representation.\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64String(byte[])",
      "begin_line": 565,
      "end_line": 567,
      "comment": "\n     * Encodes binary data using the base64 algorithm but does not chunk the output.\n     *\n     * NOTE:  We changed the behaviour of this method from multi-line chunking (commons-codec-1.4) to\n     * single-line non-chunking (commons-codec-1.5).\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return String containing Base64 characters.\n     * @since 1.4 (NOTE:  1.4 chunked the output, whereas 1.5 does not).\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byte[])",
      "begin_line": 578,
      "end_line": 580,
      "comment": "\n     * Encodes binary data using a URL-safe variation of the base64 algorithm but does not chunk the output. The\n     * url-safe variation emits - and _ instead of + and / characters.\n     * \u003cb\u003eNote: no padding is added.\u003c/b\u003e\n     * @param binaryData\n     *            binary data to encode\n     * @return byte[] containing Base64 characters in their UTF-8 representation.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byte[])",
      "begin_line": 591,
      "end_line": 593,
      "comment": "\n     * Encodes binary data using a URL-safe variation of the base64 algorithm but does not chunk the output. The\n     * url-safe variation emits - and _ instead of + and / characters.\n     * \u003cb\u003eNote: no padding is added.\u003c/b\u003e\n     * @param binaryData\n     *            binary data to encode\n     * @return String containing Base64 characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byte[])",
      "begin_line": 602,
      "end_line": 604,
      "comment": "\n     * Encodes binary data using the base64 algorithm and chunks the encoded output into 76 character blocks\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return Base64 characters chunked in 76 character blocks\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean)",
      "begin_line": 617,
      "end_line": 619,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     *\n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if {@code true} this encoder will chunk the base64 output into 76 character blocks\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean, boolean)",
      "begin_line": 636,
      "end_line": 638,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     *\n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if {@code true} this encoder will chunk the base64 output into 76 character blocks\n     * @param urlSafe\n     *            if {@code true} this encoder will emit - and _ instead of the usual + and / characters.\n     *            \u003cb\u003eNote: no padding is added when encoding using the URL-safe alphabet.\u003c/b\u003e\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean, boolean, int)",
      "begin_line": 657,
      "end_line": 675,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     *\n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if {@code true} this encoder will chunk the base64 output into 76 character blocks\n     * @param urlSafe\n     *            if {@code true} this encoder will emit - and _ instead of the usual + and / characters.\n     *            \u003cb\u003eNote: no padding is added when encoding using the URL-safe alphabet.\u003c/b\u003e\n     * @param maxResultSize\n     *            The maximum result size to accept.\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than maxResultSize\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 661,col 9)",
        "(line 665,col 9)-(line 665,col 101)",
        "(line 666,col 9)-(line 666,col 58)",
        "(line 667,col 9)-(line 672,col 9)",
        "(line 674,col 9)-(line 674,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeBase64(java.lang.String)",
      "begin_line": 685,
      "end_line": 687,
      "comment": "\n     * Decodes a Base64 String into octets\n     *\n     * @param base64String\n     *            String containing Base64 data\n     * @return Array containing decoded data.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeBase64(byte[])",
      "begin_line": 696,
      "end_line": 698,
      "comment": "\n     * Decodes Base64 data into octets\n     *\n     * @param base64Data\n     *            Byte array containing Base64 data\n     * @return Array containing decoded data.\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeInteger(byte[])",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\n     * Decodes a byte64-encoded integer according to crypto standards such as W3C\u0027s XML-Signature\n     *\n     * @param pArray\n     *            a byte array containing base64 character data\n     * @return A BigInteger\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeInteger(java.math.BigInteger)",
      "begin_line": 725,
      "end_line": 730,
      "comment": "\n     * Encodes to a byte64-encoded integer according to crypto standards such as W3C\u0027s XML-Signature\n     *\n     * @param bigInt\n     *            a BigInteger\n     * @return A byte array containing base64 character data\n     * @throws NullPointerException\n     *             if null is passed in\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 728,col 9)",
        "(line 729,col 9)-(line 729,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.toIntegerBytes(java.math.BigInteger)",
      "begin_line": 739,
      "end_line": 761,
      "comment": "\n     * Returns a byte-array representation of a \u003ccode\u003eBigInteger\u003c/code\u003e without sign bit.\n     *\n     * @param bigInt\n     *            \u003ccode\u003eBigInteger\u003c/code\u003e to be converted\n     * @return a byte array representation of the BigInteger parameter\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 40)",
        "(line 742,col 9)-(line 742,col 42)",
        "(line 743,col 9)-(line 743,col 53)",
        "(line 745,col 9)-(line 747,col 9)",
        "(line 749,col 9)-(line 749,col 25)",
        "(line 750,col 9)-(line 750,col 34)",
        "(line 753,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 46)",
        "(line 758,col 9)-(line 758,col 57)",
        "(line 759,col 9)-(line 759,col 74)",
        "(line 760,col 9)-(line 760,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isInAlphabet(byte)",
      "begin_line": 770,
      "end_line": 773,
      "comment": "\n     * Returns whether or not the \u003ccode\u003eoctet\u003c/code\u003e is in the Base64 alphabet.\n     *\n     * @param octet\n     *            The value to test\n     * @return {@code true} if the value is defined in the the Base64 alphabet {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 84)"
      ]
    }
  ]
}