{
  "filepath": "/tmp/Codec-9b/src/java/org/apache/commons/codec/binary/Base32.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base32",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.binary.BaseNCodec"
      ],
      "begin_line": 44,
      "end_line": 750,
      "comment": "\n * Provides Base32 encoding and decoding as defined by RFC 4648.\n * \n *                               \u003cb\u003eInitial implementation. API may change. Incomplete.\u003c/b\u003e\n *  \n * \u003cp\u003e\n * The class can be parameterized in the following manner with various constructors:\n * \u003cul\u003e\n * \u003cli\u003eLine length: Default 76. Line length that aren\u0027t multiples of 8 will still essentially end up being multiples of\n * 8 in the encoded data.\n * \n * \u003cli\u003eLine separator: Default is CRLF (\"\\r\\n\")\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * Since this class operates directly on byte streams, and not character streams, it is hard-coded to only encode/decode\n * character encodings which are compatible with the lower 127 ASCII chart (ISO-8859-1, Windows-1252, UTF-8, etc).\n * \u003c/p\u003e\n * \n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc4648.txt\"\u003eRFC 4648\u003c/a\u003e\n * \n * @since 1.5\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BITS_PER_ENCODED_CHAR"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * BASE32 characters are 5 bits in length. \n     * They are formed by taking a block of five octets to form a 40-bit string, \n     * which is converted into eight BASE32 characters.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BYTES_PER_UNENCODED_BLOCK"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTES_PER_ENCODED_BLOCK"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHUNK_SEPARATOR"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Chunk separator per RFC 2045 section 2.1.\n     *\n     * \u003cp\u003e\n     * N.B. The next major release may break compatibility and make this field private.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 2.1\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BASE32_ENCODE_TABLE"
      ],
      "begin_line": 70,
      "end_line": 74,
      "comment": "\n     * This array is a lookup table that translates 5-bit positive integer index values into their \"Base32 Alphabet\"\n     * equivalents as specified in Table 3 of RFC 2045.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BASE32HEX_ENCODE_TABLE"
      ],
      "begin_line": 80,
      "end_line": 84,
      "comment": "\n     * This array is a lookup table that translates 5-bit positive integer index values into their \"Base32 Hex Alphabet\"\n     * equivalents as specified in Table 3 of RFC 2045.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Byte used to pad output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BASE32_DECODE_TABLE"
      ],
      "begin_line": 97,
      "end_line": 105,
      "comment": "\n     * This array is a lookup table that translates Unicode characters drawn from the \"Base32 Alphabet\" (as specified in\n     * Table 3 of RFC 2045) into their 5-bit positive integer equivalents. Characters that are not in the Base32\n     * alphabet but fall within the bounds of the array are translated to -1.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "BASE32HEX_DECODE_TABLE"
      ],
      "begin_line": 113,
      "end_line": 121,
      "comment": "\n     * This array is a lookup table that translates Unicode characters drawn from the \"Base32 |Hex Alphabet\" (as specified in\n     * Table 3 of RFC 2045) into their 5-bit positive integer equivalents. Characters that are not in the Base32 Hex\n     * alphabet but fall within the bounds of the array are translated to -1.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_5BITS"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Mask used to extract 5 bits, used when encoding Base32 bytes "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_8BITS"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Mask used to extract 8 bits, used in decoding Base32 bytes "
    },
    {
      "type": "field",
      "varNames": [
        "encodeTable"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Encode table to use.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decodeTable"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineLength"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * Line length for encoding. Not used when decoding. A value of zero or less implies no chunking of the Base32\n     * encoded data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lineSeparator"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n     * Line separator for encoding. Not used when decoding. Only used if lineLength \u003e 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decodeSize"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of room and needs resizing.\n     * \u003ccode\u003edecodeSize \u003d 3 + lineSeparator.length;\u003c/code\u003e\n     * TODO 3?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encodeSize"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of room and needs resizing.\n     * \u003ccode\u003eencodeSize \u003d 4 + lineSeparator.length;\u003c/code\u003e\n     * TODO 4? is that BYTES_PER_ENCODED_BLOCK? - probably yes\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32.Base32()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Creates a Base32 codec used for decoding and encoding.\n     * \u003cp\u003e\n     * When encoding the line length is 0 (no chunking).\n     * \u003c/p\u003e\n     * \n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32.Base32(boolean)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * Creates a Base32 codec used for decoding and encoding.\n     * \u003cp\u003e\n     * When encoding the line length is 0 (no chunking).\n     * \u003c/p\u003e\n     * @param useHex if \u003ccode\u003etrue\u003c/code\u003e then use Base32 Hex alphabet\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32.Base32(int)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Creates a Base32 codec used for decoding and encoding.\n     * \u003cp\u003e\n     * When encoding the line length is given in the constructor, the line separator is CRLF.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 8).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32.Base32(int, byte[])",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Creates a Base32 codec used for decoding and encoding.\n     * \u003cp\u003e\n     * When encoding the line length and line separator are given in the constructor.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 8 will still essentially end up being multiples of 8 in the encoded data.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 8).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @throws IllegalArgumentException\n     *             The provided lineSeparator included some Base32 characters. That\u0027s not going to work!\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32.Base32(int, byte[], boolean)",
      "begin_line": 239,
      "end_line": 264,
      "comment": "\n     * Creates a Base32 / Base32 Hex codec used for decoding and encoding.\n     * \u003cp\u003e\n     * When encoding the line length and line separator are given in the constructor.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 8 will still essentially end up being multiples of 8 in the encoded data.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 8).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @param useHex if \u003ccode\u003etrue\u003c/code\u003e, then use Base32 Hex alphabet, otherwise use Base32 alphabet\n     * @throws IllegalArgumentException\n     *             The provided lineSeparator included some Base32 characters. That\u0027s not going to work!\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 112)",
        "(line 245,col 9)-(line 245,col 60)",
        "(line 246,col 9)-(line 246,col 88)",
        "(line 247,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 46)",
        "(line 253,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.isBase32(byte)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Returns whether or not the \u003ccode\u003eoctet\u003c/code\u003e is in the Base32 alphabet.\n     * \n     * @param octet\n     *            The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the value is defined in the the Base32 alphabet (or pad), \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.isBase32Hex(byte)",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * Returns whether or not the \u003ccode\u003eoctet\u003c/code\u003e is in the Base32 Hex alphabet.\n     * \n     * @param octet\n     *            The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the value is defined in the the Base32 Hex alphabet (or pad), \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 124)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.isBase32(java.lang.String)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n     * Tests a given String to see if it contains only valid characters within the Base32 alphabet. Currently the\n     * method treats whitespace as valid.\n     * \n     * @param base32\n     *            String to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all characters in the String are valid characters in the Base32 alphabet or if\n     *         the String is empty; \u003ccode\u003efalse\u003c/code\u003e, otherwise\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.isBase32(byte[])",
      "begin_line": 310,
      "end_line": 317,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the Base32 alphabet. Currently the\n     * method treats whitespace as valid.\n     * \n     * @param arrayOctet\n     *            byte array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all bytes are valid characters in the Base32 alphabet or if the byte array is empty;\n     *         \u003ccode\u003efalse\u003c/code\u003e, otherwise\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.containsBase32Byte(byte[])",
      "begin_line": 327,
      "end_line": 334,
      "comment": "\n     * Tests a given byte array to see if it contains any characters within the Base32 alphabet.\n     * Does not allow white-space.\n     * \n     * @param arrayOctet\n     *            byte array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if any byte is a valid character in the Base32 alphabet; \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.encodeBase32(byte[])",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * Encodes binary data using the Base32 algorithm but does not chunk the output.\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return byte[] containing Base32 characters in their UTF-8 representation.\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.encodeBase32String(byte[])",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * Encodes binary data using the Base32 algorithm but does not chunk the output.\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return String containing Base32 characters.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.encodeBase32HexString(byte[])",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * Encodes binary data using the Base32 algorithm but does not chunk the output.\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return String containing Base32Hex characters.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.encodeBase32Chunked(byte[])",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n     * Encodes binary data using the Base32 algorithm and chunks the encoded output into 76 character blocks\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return Base32 characters chunked in 76 character blocks\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.encodeBase32(byte[], boolean)",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\n     * Encodes binary data using the Base32 algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the Base32 output into 76 character blocks\n     * @return Base32-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.encodeBase32Hex(byte[], boolean)",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\n     * Encodes binary data using the Base32 Hex algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the Base32 output into 76 character blocks\n     * @return Base32Hex-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.encodeBase32(byte[], boolean, int)",
      "begin_line": 423,
      "end_line": 438,
      "comment": "\n     * Encodes binary data using the Base32 algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the Base32 output into 76 character blocks\n     * @param maxResultSize\n     *            The maximum result size to accept.\n     * @return Base32-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than maxResultSize\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)",
        "(line 428,col 9)-(line 428,col 81)",
        "(line 429,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 436,col 93)",
        "(line 437,col 9)-(line 437,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.encodeBase32Hex(byte[], boolean, int)",
      "begin_line": 453,
      "end_line": 468,
      "comment": "\n     * Encodes binary data using the Base32Hex algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the Base32 output into 76 character blocks\n     * @param maxResultSize\n     *            The maximum result size to accept.\n     * @return Base32Hex-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than maxResultSize\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 456,col 9)",
        "(line 458,col 9)-(line 458,col 81)",
        "(line 459,col 9)-(line 464,col 9)",
        "(line 466,col 9)-(line 466,col 103)",
        "(line 467,col 9)-(line 467,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.decodeBase32(java.lang.String)",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n     * Decodes a Base32 String into octets\n     *\n     * @param base32String\n     *            String containing Base32 data\n     * @return Array containing decoded data.\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.decodeBase32(byte[])",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\n     * Decodes Base32 data into octets\n     * \n     * @param base32Data\n     *            Byte array containing Base32 data\n     * @return Array containing decoded data.\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.decodeBase32Hex(java.lang.String)",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\n     * Decodes a Base32 Hex String into octets\n     *\n     * @param base32HexString\n     *            String containing Base32Hex data\n     * @return Array containing decoded data.\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.decodeBase32Hex(byte[])",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\n     * Decodes Base32 Hex data into octets\n     * \n     * @param base32HexData\n     *            Byte array containing Base32Hex data\n     * @return Array containing decoded data.\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.encode(byte[], int, int)",
      "begin_line": 528,
      "end_line": 618,
      "comment": "\n     * \u003cp\u003e\n     * Encodes all of the provided data, starting at inPos, for inAvail bytes. Must be called at least twice: once with\n     * the data to encode, and once with inAvail set to \"-1\" to alert encoder that EOF has been reached, so flush last\n     * remaining bytes (if not multiple of 5).\n     * \u003c/p\u003e\n     * \n     * @param in\n     *            byte[] array of binary data to Base32 encode.\n     * @param inPos\n     *            Position to start reading data from.\n     * @param inAvail\n     *            Amount of bytes available from input for encoding.\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 531,col 9)",
        "(line 534,col 9)-(line 617,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.decode(byte[], int, int)",
      "begin_line": 641,
      "end_line": 717,
      "comment": "\n     * \u003cp\u003e\n     * Decodes all of the provided data, starting at inPos, for inAvail bytes. Should be called at least twice: once\n     * with the data to decode, and once with inAvail set to \"-1\" to alert decoder that EOF has been reached. The \"-1\"\n     * call is not necessary when decoding, but it doesn\u0027t hurt, either.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Ignores all non-Base32 characters. This is how chunked (e.g. 76 character) data is handled, since CR and LF are\n     * silently ignored, but has implications for other bytes, too. This method subscribes to the garbage-in,\n     * garbage-out philosophy: it will not check the provided data for validity.\n     * \u003c/p\u003e\n     * \n     * @param in\n     *            byte[] array of ascii data to Base32 decode.\n     * @param inPos\n     *            Position to start reading data from.\n     * @param inAvail\n     *            Amount of bytes available from input for encoding.\n     *\n     * Output is written to {@link #buffer} as 8-bit octets, using {@link pos} as the buffer position\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 673,col 9)",
        "(line 678,col 9)-(line 716,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.getEncodeLength(byte[], int, byte[])",
      "begin_line": 730,
      "end_line": 748,
      "comment": "\n  * Pre-calculates the amount of space needed to Base32-encode the supplied array.\n  *\n  * @param pArray byte[] array which will later be encoded\n  * @param chunkSize line-length of the output (\u003c\u003d 0 means no chunking) between each\n  *        chunkSeparator (e.g. CRLF).\n  * @param chunkSeparator the sequence of bytes used to separate chunks of output (e.g. CRLF).\n  *\n  * @return amount of space needed to encoded the supplied array.  Returns\n  *         a long since a max-len array will require Integer.MAX_VALUE + 33%.\n  ",
      "child_ranges": [
        "(line 733,col 14)-(line 733,col 89)",
        "(line 735,col 14)-(line 735,col 94)",
        "(line 736,col 14)-(line 736,col 54)",
        "(line 737,col 14)-(line 739,col 14)",
        "(line 740,col 14)-(line 746,col 14)",
        "(line 747,col 14)-(line 747,col 24)"
      ]
    }
  ]
}