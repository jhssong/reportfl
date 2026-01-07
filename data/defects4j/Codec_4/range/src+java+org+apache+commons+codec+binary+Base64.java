{
  "filepath": "/tmp/Codec-4b/src/java/org/apache/commons/codec/binary/Base64.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.BinaryEncoder",
        "org.apache.commons.codec.BinaryDecoder"
      ],
      "begin_line": 53,
      "end_line": 1055,
      "comment": "\n * Provides Base64 encoding and decoding as defined by RFC 2045.\n * \n * \u003cp\u003e\n * This class implements section \u003ccite\u003e6.8. Base64 Content-Transfer-Encoding\u003c/cite\u003e from RFC 2045 \u003ccite\u003eMultipurpose\n * Internet Mail Extensions (MIME) Part One: Format of Internet Message Bodies\u003c/cite\u003e by Freed and Borenstein.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The class can be parameterized in the following manner with various constructors:\n * \u003cul\u003e\n * \u003cli\u003eURL-safe mode: Default off.\u003c/li\u003e\n * \u003cli\u003eLine length: Default 76. Line length that aren\u0027t multiples of 4 will still essentially end up being multiples of\n * 4 in the encoded data.\n * \u003cli\u003eLine separator: Default is CRLF (\"\\r\\n\")\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * Since this class operates directly on byte streams, and not character streams, it is hard-coded to only encode/decode\n * character encodings which are compatible with the lower 127 ASCII chart (ISO-8859-1, Windows-1252, UTF-8, etc).\n * \u003c/p\u003e\n * \n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @author Apache Software Foundation\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BUFFER_RESIZE_FACTOR"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BUFFER_SIZE"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHUNK_SIZE"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Chunk size per RFC 2045 section 6.8.\n     * \n     * \u003cp\u003e\n     * The {@value} character limit does not count the trailing CRLF, but counts all other characters, including any\n     * equal signs.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 6.8\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CHUNK_SEPARATOR"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Chunk separator per RFC 2045 section 2.1.\n     *\n     * \u003cp\u003e\n     * N.B. The next major release may break compatibility and make this field private.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 2.1\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STANDARD_ENCODE_TABLE"
      ],
      "begin_line": 88,
      "end_line": 94,
      "comment": "\n     * This array is a lookup table that translates 6-bit positive integer index values into their \"Base64 Alphabet\"\n     * equivalents as specified in Table 1 of RFC 2045.\n     * \n     * Thanks to \"commons\" project in ws.apache.org for this code.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "URL_SAFE_ENCODE_TABLE"
      ],
      "begin_line": 101,
      "end_line": 107,
      "comment": "\n     * This is a copy of the STANDARD_ENCODE_TABLE above, but with + and /\n     * changed to - and _ to make the encoded Base64 results more URL-SAFE.\n     * This table is only used when the Base64\u0027s mode is set to URL-SAFE.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Byte used to pad output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DECODE_TABLE"
      ],
      "begin_line": 125,
      "end_line": 133,
      "comment": "\n     * This array is a lookup table that translates Unicode characters drawn from the \"Base64 Alphabet\" (as specified in\n     * Table 1 of RFC 2045) into their 6-bit positive integer equivalents. Characters that are not in the Base64\n     * alphabet but fall within the bounds of the array are translated to -1.\n     * \n     * Note: \u0027+\u0027 and \u0027-\u0027 both decode to 62. \u0027/\u0027 and \u0027_\u0027 both decode to 63. This means decoder seamlessly handles both\n     * URL_SAFE and STANDARD base64. (The encoder, on the other hand, needs to know ahead of time what to emit).\n     * \n     * Thanks to \"commons\" project in ws.apache.org for this code.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_6BITS"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Mask used to extract 6 bits, used when encoding "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_8BITS"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Mask used to extract 8 bits, used in decoding base64 bytes "
    },
    {
      "type": "field",
      "varNames": [
        "encodeTable"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": "\n     * Encode table to use: either STANDARD or URL_SAFE. Note: the DECODE_TABLE above remains static because it is able\n     * to decode both STANDARD and URL_SAFE streams, but the encodeTable must be a member variable so we can switch\n     * between the two modes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lineLength"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": "\n     * Line length for encoding. Not used when decoding. A value of zero or less implies no chunking of the base64\n     * encoded data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lineSeparator"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": "\n     * Line separator for encoding. Not used when decoding. Only used if lineLength \u003e 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decodeSize"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of room and needs resizing.\n     * \u003ccode\u003edecodeSize \u003d 3 + lineSeparator.length;\u003c/code\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encodeSize"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of room and needs resizing.\n     * \u003ccode\u003eencodeSize \u003d 4 + lineSeparator.length;\u003c/code\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": "\n     * Buffer for streaming.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": "\n     * Position where next character should be written in the buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "readPos"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": "\n     * Position where next character should be read from the buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "currentLinePos"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": "\n     * Variable tracks how many characters have been written to the current line. Only used when encoding. We use it to\n     * make sure each encoded line never goes beyond lineLength (if lineLength \u003e 0).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "modulus"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": "\n     * Writes to the buffer only occur after every 3 reads when encoding, an every 4 reads when decoding. This variable\n     * helps track that.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "eof"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": "\n     * Boolean flag to indicate the EOF has been reached. Once EOF has been reached, this Base64 object becomes useless,\n     * and must be thrown away.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": "\n     * Place holder for the 3 bytes we\u0027re dealing with for our base64 logic. Bitwise operations store and extract the\n     * base64 encoding or decoding from this variable.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length is 0 (no chunking), and the encoding table is STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(boolean)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in the given URL-safe mode.\n     * \u003cp\u003e\n     * When encoding the line length is 76, the line separator is CRLF, and the encoding table is STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     * \n     * @param urlSafe\n     *            if \u003ccode\u003etrue\u003c/code\u003e, URL-safe encoding is used. In most cases this should be set to\n     *            \u003ccode\u003efalse\u003c/code\u003e.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int)",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length is given in the constructor, the line separator is CRLF, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 4).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int, byte[])",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length and line separator are given in the constructor, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 4).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @throws IllegalArgumentException\n     *             Thrown when the provided lineSeparator included some base64 characters.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int, byte[], boolean)",
      "begin_line": 320,
      "end_line": 339,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length and line separator are given in the constructor, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 4).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @param urlSafe\n     *            Instead of emitting \u0027+\u0027 and \u0027/\u0027 we emit \u0027-\u0027 and \u0027_\u0027 respectively. urlSafe is only applied to encode\n     *            operations. Decoding seamlessly handles both modes.\n     * @throws IllegalArgumentException\n     *             The provided lineSeparator included some base64 characters. That\u0027s not going to work!\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 68)",
        "(line 326,col 9)-(line 326,col 60)",
        "(line 327,col 9)-(line 327,col 88)",
        "(line 328,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 46)",
        "(line 334,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isUrlSafe()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\n     * Returns our current encode mode. True if we\u0027re URL-SAFE, false otherwise.\n     * \n     * @return true if we\u0027re in URL-SAFE mode, false otherwise.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.hasData()",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\n     * Returns true if this Base64 object has buffered data for reading.\n     * \n     * @return true if there is Base64 object still available for reading.\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.avail()",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * Returns the amount of buffered data available for reading.\n     * \n     * @return The amount of buffered data available for reading.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.resizeBuffer()",
      "begin_line": 370,
      "end_line": 380,
      "comment": " Doubles our buffer. ",
      "child_ranges": [
        "(line 371,col 9)-(line 379,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.readResults(byte[], int, int)",
      "begin_line": 394,
      "end_line": 411,
      "comment": "\n     * Extracts buffered data into the provided byte[] array, starting at position bPos, up to a maximum of bAvail\n     * bytes. Returns how many bytes were actually extracted.\n     * \n     * @param b\n     *            byte[] array to extract the buffered data into.\n     * @param bPos\n     *            position in byte[] array to start extraction at.\n     * @param bAvail\n     *            amount of bytes we\u0027re allowed to extract. We may extract fewer (if fewer are available).\n     * @return The number of bytes successfully extracted into the provided byte[] array.\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.setInitialBuffer(byte[], int, int)",
      "begin_line": 424,
      "end_line": 432,
      "comment": "\n     * Sets the streaming buffer. This is a small optimization where we try to buffer directly to the consumer\u0027s output\n     * array for one round (if the consumer calls this method first) instead of starting our own buffer.\n     * \n     * @param out\n     *            byte[] array to buffer directly to.\n     * @param outPos\n     *            Position to start buffering into.\n     * @param outAvail\n     *            Amount of bytes available for direct buffering.\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 431,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(byte[], int, int)",
      "begin_line": 452,
      "end_line": 513,
      "comment": "\n     * \u003cp\u003e\n     * Encodes all of the provided data, starting at inPos, for inAvail bytes. Must be called at least twice: once with\n     * the data to encode, and once with inAvail set to \"-1\" to alert encoder that EOF has been reached, so flush last\n     * remaining bytes (if not multiple of 3).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Thanks to \"commons\" project in ws.apache.org for the bitwise operations, and general approach.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     * \u003c/p\u003e\n     * \n     * @param in\n     *            byte[] array of binary data to base64 encode.\n     * @param inPos\n     *            Position to start reading data from.\n     * @param inAvail\n     *            Amount of bytes available from input for encoding.\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 455,col 9)",
        "(line 458,col 9)-(line 512,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(byte[], int, int)",
      "begin_line": 538,
      "end_line": 586,
      "comment": "\n     * \u003cp\u003e\n     * Decodes all of the provided data, starting at inPos, for inAvail bytes. Should be called at least twice: once\n     * with the data to decode, and once with inAvail set to \"-1\" to alert decoder that EOF has been reached. The \"-1\"\n     * call is not necessary when decoding, but it doesn\u0027t hurt, either.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Ignores all non-base64 characters. This is how chunked (e.g. 76 character) data is handled, since CR and LF are\n     * silently ignored, but has implications for other bytes, too. This method subscribes to the garbage-in,\n     * garbage-out philosophy: it will not check the provided data for validity.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Thanks to \"commons\" project in ws.apache.org for the bitwise operations, and general approach.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     * \u003c/p\u003e\n     * \n     * @param in\n     *            byte[] array of ascii data to base64 decode.\n     * @param inPos\n     *            Position to start reading data from.\n     * @param inAvail\n     *            Amount of bytes available from input for encoding.\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 568,col 9)",
        "(line 573,col 9)-(line 585,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isBase64(byte)",
      "begin_line": 596,
      "end_line": 598,
      "comment": "\n     * Returns whether or not the \u003ccode\u003eoctet\u003c/code\u003e is in the base 64 alphabet.\n     * \n     * @param octet\n     *            The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the value is defined in the the base 64 alphabet, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isArrayByteBase64(byte[])",
      "begin_line": 609,
      "end_line": 616,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the Base64 alphabet. Currently the\n     * method treats whitespace as valid.\n     * \n     * @param arrayOctet\n     *            byte array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all bytes are valid characters in the Base64 alphabet or if the byte array is empty;\n     *         false, otherwise\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 615,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.containsBase64Byte(byte[])",
      "begin_line": 625,
      "end_line": 632,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the Base64 alphabet.\n     * \n     * @param arrayOctet\n     *            byte array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if any byte is a valid character in the Base64 alphabet; false herwise\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[])",
      "begin_line": 641,
      "end_line": 643,
      "comment": "\n     * Encodes binary data using the base64 algorithm but does not chunk the output.\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return byte[] containing Base64 characters in their UTF-8 representation.\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64String(byte[])",
      "begin_line": 653,
      "end_line": 655,
      "comment": "\n     * Encodes binary data using the base64 algorithm into 76 character blocks separated by CRLF.\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return String containing Base64 characters.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byte[])",
      "begin_line": 666,
      "end_line": 668,
      "comment": "\n     * Encodes binary data using a URL-safe variation of the base64 algorithm but does not chunk the output. The\n     * url-safe variation emits - and _ instead of + and / characters.\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return byte[] containing Base64 characters in their UTF-8 representation.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byte[])",
      "begin_line": 679,
      "end_line": 681,
      "comment": "\n     * Encodes binary data using a URL-safe variation of the base64 algorithm but does not chunk the output. The\n     * url-safe variation emits - and _ instead of + and / characters.\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return String containing Base64 characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byte[])",
      "begin_line": 690,
      "end_line": 692,
      "comment": "\n     * Encodes binary data using the base64 algorithm and chunks the encoded output into 76 character blocks\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return Base64 characters chunked in 76 character blocks\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(java.lang.Object)",
      "begin_line": 704,
      "end_line": 712,
      "comment": "\n     * Decodes an Object using the base64 algorithm. This method is provided in order to satisfy the requirements of the\n     * Decoder interface, and will throw a DecoderException if the supplied object is not of type byte[] or String.\n     * \n     * @param pObject\n     *            Object to decode\n     * @return An object (of type byte[]) containing the binary data which corresponds to the byte[] or String supplied.\n     * @throws DecoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 711,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(java.lang.String)",
      "begin_line": 722,
      "end_line": 724,
      "comment": "\n     * Decodes a String containing containing characters in the Base64 alphabet.\n     *\n     * @param pArray\n     *            A String containing Base64 character data\n     * @return a byte array containing binary data\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(byte[])",
      "begin_line": 733,
      "end_line": 753,
      "comment": "\n     * Decodes a byte[] containing containing characters in the Base64 alphabet.\n     * \n     * @param pArray\n     *            A byte array containing Base64 character data\n     * @return a byte array containing binary data\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 16)",
        "(line 735,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 738,col 43)",
        "(line 739,col 9)-(line 739,col 41)",
        "(line 740,col 9)-(line 740,col 45)",
        "(line 741,col 9)-(line 741,col 41)",
        "(line 742,col 9)-(line 742,col 30)",
        "(line 750,col 9)-(line 750,col 38)",
        "(line 751,col 9)-(line 751,col 46)",
        "(line 752,col 9)-(line 752,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean)",
      "begin_line": 766,
      "end_line": 768,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean, boolean)",
      "begin_line": 784,
      "end_line": 786,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @param urlSafe\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will emit - and _ instead of the usual + and / characters.\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean, boolean, int)",
      "begin_line": 804,
      "end_line": 819,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @param urlSafe\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will emit - and _ instead of the usual + and / characters.\n     * @param maxResultSize\n     *            The maximum result size to accept.\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than maxResultSize\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 807,col 9)",
        "(line 809,col 9)-(line 809,col 76)",
        "(line 810,col 9)-(line 815,col 9)",
        "(line 817,col 9)-(line 817,col 95)",
        "(line 818,col 9)-(line 818,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeBase64(java.lang.String)",
      "begin_line": 829,
      "end_line": 831,
      "comment": "\n     * Decodes a Base64 String into octets\n     *\n     * @param base64String\n     *            String containing Base64 data\n     * @return Array containing decoded data.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeBase64(byte[])",
      "begin_line": 840,
      "end_line": 842,
      "comment": "\n     * Decodes Base64 data into octets\n     * \n     * @param base64Data\n     *            Byte array containing Base64 data\n     * @return Array containing decoded data.\n     ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.discardWhitespace(byte[])",
      "begin_line": 852,
      "end_line": 869,
      "comment": "\n     * Discards any whitespace from a base-64 encoded block.\n     * \n     * @param data\n     *            The base-64 encoded data to discard the whitespace from.\n     * @return The data, less whitespace (see RFC 2045).\n     * @deprecated This method is no longer needed\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 51)",
        "(line 854,col 9)-(line 854,col 28)",
        "(line 855,col 9)-(line 865,col 9)",
        "(line 866,col 9)-(line 866,col 50)",
        "(line 867,col 9)-(line 867,col 69)",
        "(line 868,col 9)-(line 868,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isWhiteSpace(byte)",
      "begin_line": 878,
      "end_line": 888,
      "comment": "\n     * Checks if a byte value is whitespace or not.\n     * \n     * @param byteToCheck\n     *            the byte to check\n     * @return true if byte is whitespace, false otherwise\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 887,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(java.lang.Object)",
      "begin_line": 902,
      "end_line": 907,
      "comment": "\n     * Encodes an Object using the base64 algorithm. This method is provided in order to satisfy the requirements of the\n     * Encoder interface, and will throw an EncoderException if the supplied object is not of type byte[].\n     * \n     * @param pObject\n     *            Object to encode\n     * @return An object (of type byte[]) containing the base64 encoded data which corresponds to the byte[] supplied.\n     * @throws EncoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 906,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeToString(byte[])",
      "begin_line": 917,
      "end_line": 919,
      "comment": "\n     * Encodes a byte[] containing binary data, into a String containing characters in the Base64 alphabet.\n     *\n     * @param pArray\n     *            a byte array containing binary data\n     * @return A String containing only Base64 character data\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 918,col 9)-(line 918,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(byte[])",
      "begin_line": 928,
      "end_line": 950,
      "comment": "\n     * Encodes a byte[] containing binary data, into a byte[] containing characters in the Base64 alphabet.\n     * \n     * @param pArray\n     *            a byte array containing binary data\n     * @return A byte array containing only Base64 character data\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 16)",
        "(line 930,col 9)-(line 932,col 9)",
        "(line 933,col 9)-(line 933,col 70)",
        "(line 934,col 9)-(line 934,col 41)",
        "(line 935,col 9)-(line 935,col 45)",
        "(line 936,col 9)-(line 936,col 41)",
        "(line 937,col 9)-(line 937,col 30)",
        "(line 939,col 9)-(line 941,col 9)",
        "(line 944,col 9)-(line 948,col 9)",
        "(line 949,col 9)-(line 949,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.getEncodeLength(byte[], int, byte[])",
      "begin_line": 963,
      "end_line": 980,
      "comment": "\n     * Pre-calculates the amount of space needed to base64-encode the supplied array.\n     *\n     * @param pArray byte[] array which will later be encoded\n     * @param chunkSize line-length of the output (\u003c\u003d 0 means no chunking) between each\n     *        chunkSeparator (e.g. CRLF).\n     * @param chunkSeparator the sequence of bytes used to separate chunks of output (e.g. CRLF).\n     *\n     * @return amount of space needed to encoded the supplied array.  Returns\n     *         a long since a max-len array will require Integer.MAX_VALUE + 33%.\n     ",
      "child_ranges": [
        "(line 965,col 9)-(line 965,col 40)",
        "(line 967,col 9)-(line 967,col 43)",
        "(line 968,col 9)-(line 968,col 27)",
        "(line 969,col 9)-(line 971,col 9)",
        "(line 972,col 9)-(line 978,col 9)",
        "(line 979,col 9)-(line 979,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeInteger(byte[])",
      "begin_line": 991,
      "end_line": 993,
      "comment": "\n     * Decodes a byte64-encoded integer according to crypto standards such as W3C\u0027s XML-Signature\n     * \n     * @param pArray\n     *            a byte array containing base64 character data\n     * @return A BigInteger\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 992,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeInteger(java.math.BigInteger)",
      "begin_line": 1005,
      "end_line": 1010,
      "comment": "\n     * Encodes to a byte64-encoded integer according to crypto standards such as W3C\u0027s XML-Signature\n     * \n     * @param bigInt\n     *            a BigInteger\n     * @return A byte array containing base64 character data\n     * @throws NullPointerException\n     *             if null is passed in\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1008,col 9)",
        "(line 1009,col 9)-(line 1009,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.toIntegerBytes(java.math.BigInteger)",
      "begin_line": 1019,
      "end_line": 1041,
      "comment": "\n     * Returns a byte-array representation of a \u003ccode\u003eBigInteger\u003c/code\u003e without sign bit.\n     * \n     * @param bigInt\n     *            \u003ccode\u003eBigInteger\u003c/code\u003e to be converted\n     * @return a byte array representation of the BigInteger parameter\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 40)",
        "(line 1022,col 9)-(line 1022,col 42)",
        "(line 1023,col 9)-(line 1023,col 47)",
        "(line 1025,col 9)-(line 1027,col 9)",
        "(line 1029,col 9)-(line 1029,col 25)",
        "(line 1030,col 9)-(line 1030,col 34)",
        "(line 1033,col 9)-(line 1036,col 9)",
        "(line 1037,col 9)-(line 1037,col 40)",
        "(line 1038,col 9)-(line 1038,col 51)",
        "(line 1039,col 9)-(line 1039,col 74)",
        "(line 1040,col 9)-(line 1040,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.reset()",
      "begin_line": 1046,
      "end_line": 1053,
      "comment": "\n     * Resets this Base64 object to its initial newly constructed state.\n     ",
      "child_ranges": [
        "(line 1047,col 9)-(line 1047,col 22)",
        "(line 1048,col 9)-(line 1048,col 16)",
        "(line 1049,col 9)-(line 1049,col 20)",
        "(line 1050,col 9)-(line 1050,col 27)",
        "(line 1051,col 9)-(line 1051,col 20)",
        "(line 1052,col 9)-(line 1052,col 20)"
      ]
    }
  ]
}