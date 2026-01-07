{
  "filepath": "/tmp/Codec-10b/src/java/org/apache/commons/codec/binary/Base32.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base32",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.binary.BaseNCodec"
      ],
      "begin_line": 45,
      "end_line": 471,
      "comment": "\n * Provides Base32 encoding and decoding as defined by RFC 4648.\n * \n * \u003cp\u003e\n * The class can be parameterized in the following manner with various constructors:\n * \u003cul\u003e\n * \u003cli\u003eWhether to use the \"base32hex\" variant instead of the default \"base32\"\u003c/li\u003e\n * \u003cli\u003eLine length: Default 76. Line length that aren\u0027t multiples of 8 will still essentially end up being multiples of\n * 8 in the encoded data.\n * \u003cli\u003eLine separator: Default is CRLF (\"\\r\\n\")\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class operates directly on byte streams, and not character streams.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class is not thread-safe.\n * Each thread should use its own instance.\n * \u003c/p\u003e\n * \n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc4648.txt\"\u003eRFC 4648\u003c/a\u003e\n * \n * @since 1.5\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BITS_PER_ENCODED_BYTE"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * BASE32 characters are 5 bits in length. \n     * They are formed by taking a block of five octets to form a 40-bit string, \n     * which is converted into eight BASE32 characters.\n     "
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
        "BYTES_PER_UNENCODED_BLOCK"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHUNK_SEPARATOR"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Chunk separator per RFC 2045 section 2.1.\n     *\n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 2.1\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DECODE_TABLE"
      ],
      "begin_line": 69,
      "end_line": 77,
      "comment": "\n     * This array is a lookup table that translates Unicode characters drawn from the \"Base32 Alphabet\" (as specified in\n     * Table 3 of RFC 2045) into their 5-bit positive integer equivalents. Characters that are not in the Base32\n     * alphabet but fall within the bounds of the array are translated to -1.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "ENCODE_TABLE"
      ],
      "begin_line": 83,
      "end_line": 87,
      "comment": "\n     * This array is a lookup table that translates 5-bit positive integer index values into their \"Base32 Alphabet\"\n     * equivalents as specified in Table 3 of RFC 2045.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "HEX_DECODE_TABLE"
      ],
      "begin_line": 95,
      "end_line": 103,
      "comment": "\n     * This array is a lookup table that translates Unicode characters drawn from the \"Base32 |Hex Alphabet\" (as specified in\n     * Table 3 of RFC 2045) into their 5-bit positive integer equivalents. Characters that are not in the Base32 Hex\n     * alphabet but fall within the bounds of the array are translated to -1.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "HEX_ENCODE_TABLE"
      ],
      "begin_line": 109,
      "end_line": 113,
      "comment": "\n     * This array is a lookup table that translates 5-bit positive integer index values into their \"Base32 Hex Alphabet\"\n     * equivalents as specified in Table 3 of RFC 2045.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_5BITS"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Mask used to extract 5 bits, used when encoding Base32 bytes "
    },
    {
      "type": "field",
      "varNames": [
        "bitWorkArea"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * Place holder for the bytes we\u0027re dealing with for our based logic. \n     * Bitwise operations store and extract the encoding or decoding from this variable.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decodeSize"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of room and needs resizing.\n     * \u003ccode\u003edecodeSize \u003d {@link BYTES_PER_ENCODED_BLOCK} - 1 + lineSeparator.length;\u003c/code\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decodeTable"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Decode table to use.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encodeSize"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of room and needs resizing.\n     * \u003ccode\u003eencodeSize \u003d {@link BYTES_PER_ENCODED_BLOCK} + lineSeparator.length;\u003c/code\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encodeTable"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n     * Encode table to use.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lineSeparator"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": "\n     * Line separator for encoding. Not used when decoding. Only used if lineLength \u003e 0.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32.Base32()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Creates a Base32 codec used for decoding and encoding.\n     * \u003cp\u003e\n     * When encoding the line length is 0 (no chunking).\n     * \u003c/p\u003e\n     * \n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32.Base32(boolean)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Creates a Base32 codec used for decoding and encoding.\n     * \u003cp\u003e\n     * When encoding the line length is 0 (no chunking).\n     * \u003c/p\u003e\n     * @param useHex if \u003ccode\u003etrue\u003c/code\u003e then use Base32 Hex alphabet\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32.Base32(int)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Creates a Base32 codec used for decoding and encoding.\n     * \u003cp\u003e\n     * When encoding the line length is given in the constructor, the line separator is CRLF.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 8).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32.Base32(int, byte[])",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Creates a Base32 codec used for decoding and encoding.\n     * \u003cp\u003e\n     * When encoding the line length and line separator are given in the constructor.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 8 will still essentially end up being multiples of 8 in the encoded data.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 8).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @throws IllegalArgumentException\n     *             The provided lineSeparator included some Base32 characters. That\u0027s not going to work!\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32.Base32(int, byte[], boolean)",
      "begin_line": 231,
      "end_line": 259,
      "comment": "\n     * Creates a Base32 / Base32 Hex codec used for decoding and encoding.\n     * \u003cp\u003e\n     * When encoding the line length and line separator are given in the constructor.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 8 will still essentially end up being multiples of 8 in the encoded data.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 8).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @param useHex if \u003ccode\u003etrue\u003c/code\u003e, then use Base32 Hex alphabet, otherwise use Base32 alphabet\n     * @throws IllegalArgumentException\n     *             The provided lineSeparator included some Base32 characters. That\u0027s not going to work!\n     *             Or the lineLength \u003e 0 and lineSeparator is null.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 66)",
        "(line 235,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.decode(byte[], int, int)",
      "begin_line": 282,
      "end_line": 354,
      "comment": "\n     * \u003cp\u003e\n     * Decodes all of the provided data, starting at inPos, for inAvail bytes. Should be called at least twice: once\n     * with the data to decode, and once with inAvail set to \"-1\" to alert decoder that EOF has been reached. The \"-1\"\n     * call is not necessary when decoding, but it doesn\u0027t hurt, either.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Ignores all non-Base32 characters. This is how chunked (e.g. 76 character) data is handled, since CR and LF are\n     * silently ignored, but has implications for other bytes, too. This method subscribes to the garbage-in,\n     * garbage-out philosophy: it will not check the provided data for validity.\n     * \u003c/p\u003e\n     * \n     * @param in\n     *            byte[] array of ascii data to Base32 decode.\n     * @param inPos\n     *            Position to start reading data from.\n     * @param inAvail\n     *            Amount of bytes available from input for encoding.\n     *\n     * Output is written to {@link #buffer} as 8-bit octets, using {@link pos} as the buffer position\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 312,col 9)",
        "(line 317,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.encode(byte[], int, int)",
      "begin_line": 370,
      "end_line": 459,
      "comment": "\n     * \u003cp\u003e\n     * Encodes all of the provided data, starting at inPos, for inAvail bytes. Must be called at least twice: once with\n     * the data to encode, and once with inAvail set to \"-1\" to alert encoder that EOF has been reached, so flush last\n     * remaining bytes (if not multiple of 5).\n     * \u003c/p\u003e\n     * \n     * @param in\n     *            byte[] array of binary data to Base32 encode.\n     * @param inPos\n     *            Position to start reading data from.\n     * @param inAvail\n     *            Amount of bytes available from input for encoding.\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 373,col 9)",
        "(line 376,col 9)-(line 458,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32.isInAlphabet(byte)",
      "begin_line": 468,
      "end_line": 470,
      "comment": "\n     * Returns whether or not the \u003ccode\u003eoctet\u003c/code\u003e is in the Base32 alphabet.\n     * \n     * @param octet\n     *            The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the value is defined in the the Base32 alphabet \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 84)"
      ]
    }
  ]
}