{
  "filepath": "/tmp/Codec-7b/src/java/org/apache/commons/codec/binary/Base64.java",
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
      "end_line": 1071,
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
        "MIME_CHUNK_SIZE"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     *  MIME chunk size per RFC 2045 section 6.8.\n     * \n     * \u003cp\u003e\n     * The {@value} character limit does not count the trailing CRLF, but counts all other characters, including any\n     * equal signs.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 6.8\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PEM_CHUNK_SIZE"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * PEM chunk size per RFC 1421 section 4.3.2.4.\n     * \n     * \u003cp\u003e\n     * The {@value} character limit does not count the trailing CRLF, but counts all other characters, including any\n     * equal signs.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc1421\"\u003eRFC 1421 section 4.3.2.4\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CHUNK_SEPARATOR"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Chunk separator per RFC 2045 section 2.1.\n     *\n     * \u003cp\u003e\n     * N.B. The next major release may break compatibility and make this field private.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 2.1\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STANDARD_ENCODE_TABLE"
      ],
      "begin_line": 100,
      "end_line": 106,
      "comment": "\n     * This array is a lookup table that translates 6-bit positive integer index values into their \"Base64 Alphabet\"\n     * equivalents as specified in Table 1 of RFC 2045.\n     * \n     * Thanks to \"commons\" project in ws.apache.org for this code.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "URL_SAFE_ENCODE_TABLE"
      ],
      "begin_line": 113,
      "end_line": 119,
      "comment": "\n     * This is a copy of the STANDARD_ENCODE_TABLE above, but with + and /\n     * changed to - and _ to make the encoded Base64 results more URL-SAFE.\n     * This table is only used when the Base64\u0027s mode is set to URL-SAFE.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * Byte used to pad output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DECODE_TABLE"
      ],
      "begin_line": 137,
      "end_line": 145,
      "comment": "\n     * This array is a lookup table that translates Unicode characters drawn from the \"Base64 Alphabet\" (as specified in\n     * Table 1 of RFC 2045) into their 6-bit positive integer equivalents. Characters that are not in the Base64\n     * alphabet but fall within the bounds of the array are translated to -1.\n     * \n     * Note: \u0027+\u0027 and \u0027-\u0027 both decode to 62. \u0027/\u0027 and \u0027_\u0027 both decode to 63. This means decoder seamlessly handles both\n     * URL_SAFE and STANDARD base64. (The encoder, on the other hand, needs to know ahead of time what to emit).\n     * \n     * Thanks to \"commons\" project in ws.apache.org for this code.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_6BITS"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " Mask used to extract 6 bits, used when encoding "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_8BITS"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " Mask used to extract 8 bits, used in decoding base64 bytes "
    },
    {
      "type": "field",
      "varNames": [
        "encodeTable"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n     * Encode table to use: either STANDARD or URL_SAFE. Note: the DECODE_TABLE above remains static because it is able\n     * to decode both STANDARD and URL_SAFE streams, but the encodeTable must be a member variable so we can switch\n     * between the two modes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lineLength"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": "\n     * Line length for encoding. Not used when decoding. A value of zero or less implies no chunking of the base64\n     * encoded data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lineSeparator"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": "\n     * Line separator for encoding. Not used when decoding. Only used if lineLength \u003e 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decodeSize"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of room and needs resizing.\n     * \u003ccode\u003edecodeSize \u003d 3 + lineSeparator.length;\u003c/code\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encodeSize"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of room and needs resizing.\n     * \u003ccode\u003eencodeSize \u003d 4 + lineSeparator.length;\u003c/code\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": "\n     * Buffer for streaming.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * Position where next character should be written in the buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "readPos"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": "\n     * Position where next character should be read from the buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "currentLinePos"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": "\n     * Variable tracks how many characters have been written to the current line. Only used when encoding. We use it to\n     * make sure each encoded line never goes beyond lineLength (if lineLength \u003e 0).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "modulus"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": "\n     * Writes to the buffer only occur after every 3 reads when encoding, an every 4 reads when decoding. This variable\n     * helps track that.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "eof"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": "\n     * Boolean flag to indicate the EOF has been reached. Once EOF has been reached, this Base64 object becomes useless,\n     * and must be thrown away.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": "\n     * Place holder for the 3 bytes we\u0027re dealing with for our base64 logic. Bitwise operations store and extract the\n     * base64 encoding or decoding from this variable.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length is 0 (no chunking), and the encoding table is STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(boolean)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in the given URL-safe mode.\n     * \u003cp\u003e\n     * When encoding the line length is 76, the line separator is CRLF, and the encoding table is STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     * \n     * @param urlSafe\n     *            if \u003ccode\u003etrue\u003c/code\u003e, URL-safe encoding is used. In most cases this should be set to\n     *            \u003ccode\u003efalse\u003c/code\u003e.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int)",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length is given in the constructor, the line separator is CRLF, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 4).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int, byte[])",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length and line separator are given in the constructor, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 4).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @throws IllegalArgumentException\n     *             Thrown when the provided lineSeparator included some base64 characters.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int, byte[], boolean)",
      "begin_line": 332,
      "end_line": 351,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length and line separator are given in the constructor, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 4).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @param urlSafe\n     *            Instead of emitting \u0027+\u0027 and \u0027/\u0027 we emit \u0027-\u0027 and \u0027_\u0027 respectively. urlSafe is only applied to encode\n     *            operations. Decoding seamlessly handles both modes.\n     * @throws IllegalArgumentException\n     *             The provided lineSeparator included some base64 characters. That\u0027s not going to work!\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 68)",
        "(line 338,col 9)-(line 338,col 60)",
        "(line 339,col 9)-(line 339,col 88)",
        "(line 340,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 46)",
        "(line 346,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isUrlSafe()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n     * Returns our current encode mode. True if we\u0027re URL-SAFE, false otherwise.\n     * \n     * @return true if we\u0027re in URL-SAFE mode, false otherwise.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.hasData()",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * Returns true if this Base64 object has buffered data for reading.\n     * \n     * @return true if there is Base64 object still available for reading.\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.avail()",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * Returns the amount of buffered data available for reading.\n     * \n     * @return The amount of buffered data available for reading.\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.resizeBuffer()",
      "begin_line": 382,
      "end_line": 392,
      "comment": " Doubles our buffer. ",
      "child_ranges": [
        "(line 383,col 9)-(line 391,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.readResults(byte[], int, int)",
      "begin_line": 406,
      "end_line": 423,
      "comment": "\n     * Extracts buffered data into the provided byte[] array, starting at position bPos, up to a maximum of bAvail\n     * bytes. Returns how many bytes were actually extracted.\n     * \n     * @param b\n     *            byte[] array to extract the buffered data into.\n     * @param bPos\n     *            position in byte[] array to start extraction at.\n     * @param bAvail\n     *            amount of bytes we\u0027re allowed to extract. We may extract fewer (if fewer are available).\n     * @return The number of bytes successfully extracted into the provided byte[] array.\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.setInitialBuffer(byte[], int, int)",
      "begin_line": 436,
      "end_line": 444,
      "comment": "\n     * Sets the streaming buffer. This is a small optimization where we try to buffer directly to the consumer\u0027s output\n     * array for one round (if the consumer calls this method first) instead of starting our own buffer.\n     * \n     * @param out\n     *            byte[] array to buffer directly to.\n     * @param outPos\n     *            Position to start buffering into.\n     * @param outAvail\n     *            Amount of bytes available for direct buffering.\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 443,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(byte[], int, int)",
      "begin_line": 464,
      "end_line": 525,
      "comment": "\n     * \u003cp\u003e\n     * Encodes all of the provided data, starting at inPos, for inAvail bytes. Must be called at least twice: once with\n     * the data to encode, and once with inAvail set to \"-1\" to alert encoder that EOF has been reached, so flush last\n     * remaining bytes (if not multiple of 3).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Thanks to \"commons\" project in ws.apache.org for the bitwise operations, and general approach.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     * \u003c/p\u003e\n     * \n     * @param in\n     *            byte[] array of binary data to base64 encode.\n     * @param inPos\n     *            Position to start reading data from.\n     * @param inAvail\n     *            Amount of bytes available from input for encoding.\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 467,col 9)",
        "(line 470,col 9)-(line 524,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(byte[], int, int)",
      "begin_line": 550,
      "end_line": 602,
      "comment": "\n     * \u003cp\u003e\n     * Decodes all of the provided data, starting at inPos, for inAvail bytes. Should be called at least twice: once\n     * with the data to decode, and once with inAvail set to \"-1\" to alert decoder that EOF has been reached. The \"-1\"\n     * call is not necessary when decoding, but it doesn\u0027t hurt, either.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Ignores all non-base64 characters. This is how chunked (e.g. 76 character) data is handled, since CR and LF are\n     * silently ignored, but has implications for other bytes, too. This method subscribes to the garbage-in,\n     * garbage-out philosophy: it will not check the provided data for validity.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Thanks to \"commons\" project in ws.apache.org for the bitwise operations, and general approach.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     * \u003c/p\u003e\n     * \n     * @param in\n     *            byte[] array of ascii data to base64 decode.\n     * @param inPos\n     *            Position to start reading data from.\n     * @param inAvail\n     *            Amount of bytes available from input for encoding.\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 580,col 9)",
        "(line 585,col 9)-(line 601,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isBase64(byte)",
      "begin_line": 612,
      "end_line": 614,
      "comment": "\n     * Returns whether or not the \u003ccode\u003eoctet\u003c/code\u003e is in the base 64 alphabet.\n     * \n     * @param octet\n     *            The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the value is defined in the the base 64 alphabet, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isArrayByteBase64(byte[])",
      "begin_line": 625,
      "end_line": 632,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the Base64 alphabet. Currently the\n     * method treats whitespace as valid.\n     * \n     * @param arrayOctet\n     *            byte array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all bytes are valid characters in the Base64 alphabet or if the byte array is empty;\n     *         false, otherwise\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.containsBase64Byte(byte[])",
      "begin_line": 641,
      "end_line": 648,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the Base64 alphabet.\n     * \n     * @param arrayOctet\n     *            byte array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if any byte is a valid character in the Base64 alphabet; false herwise\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 647,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[])",
      "begin_line": 657,
      "end_line": 659,
      "comment": "\n     * Encodes binary data using the base64 algorithm but does not chunk the output.\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return byte[] containing Base64 characters in their UTF-8 representation.\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64String(byte[])",
      "begin_line": 669,
      "end_line": 671,
      "comment": "\n     * Encodes binary data using the base64 algorithm into 76 character blocks separated by CRLF.\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return String containing Base64 characters.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byte[])",
      "begin_line": 682,
      "end_line": 684,
      "comment": "\n     * Encodes binary data using a URL-safe variation of the base64 algorithm but does not chunk the output. The\n     * url-safe variation emits - and _ instead of + and / characters.\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return byte[] containing Base64 characters in their UTF-8 representation.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byte[])",
      "begin_line": 695,
      "end_line": 697,
      "comment": "\n     * Encodes binary data using a URL-safe variation of the base64 algorithm but does not chunk the output. The\n     * url-safe variation emits - and _ instead of + and / characters.\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return String containing Base64 characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byte[])",
      "begin_line": 706,
      "end_line": 708,
      "comment": "\n     * Encodes binary data using the base64 algorithm and chunks the encoded output into 76 character blocks\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return Base64 characters chunked in 76 character blocks\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(java.lang.Object)",
      "begin_line": 720,
      "end_line": 728,
      "comment": "\n     * Decodes an Object using the base64 algorithm. This method is provided in order to satisfy the requirements of the\n     * Decoder interface, and will throw a DecoderException if the supplied object is not of type byte[] or String.\n     * \n     * @param pObject\n     *            Object to decode\n     * @return An object (of type byte[]) containing the binary data which corresponds to the byte[] or String supplied.\n     * @throws DecoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 727,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(java.lang.String)",
      "begin_line": 738,
      "end_line": 740,
      "comment": "\n     * Decodes a String containing characters in the Base64 alphabet.\n     *\n     * @param pArray\n     *            A String containing Base64 character data\n     * @return a byte array containing binary data\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(byte[])",
      "begin_line": 749,
      "end_line": 769,
      "comment": "\n     * Decodes a byte[] containing characters in the Base64 alphabet.\n     * \n     * @param pArray\n     *            A byte array containing Base64 character data\n     * @return a byte array containing binary data\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 16)",
        "(line 751,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 754,col 43)",
        "(line 755,col 9)-(line 755,col 41)",
        "(line 756,col 9)-(line 756,col 45)",
        "(line 757,col 9)-(line 757,col 41)",
        "(line 758,col 9)-(line 758,col 30)",
        "(line 766,col 9)-(line 766,col 38)",
        "(line 767,col 9)-(line 767,col 46)",
        "(line 768,col 9)-(line 768,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean)",
      "begin_line": 782,
      "end_line": 784,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean, boolean)",
      "begin_line": 800,
      "end_line": 802,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @param urlSafe\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will emit - and _ instead of the usual + and / characters.\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean, boolean, int)",
      "begin_line": 820,
      "end_line": 835,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @param urlSafe\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will emit - and _ instead of the usual + and / characters.\n     * @param maxResultSize\n     *            The maximum result size to accept.\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than maxResultSize\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 823,col 9)",
        "(line 825,col 9)-(line 825,col 81)",
        "(line 826,col 9)-(line 831,col 9)",
        "(line 833,col 9)-(line 833,col 95)",
        "(line 834,col 9)-(line 834,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeBase64(java.lang.String)",
      "begin_line": 845,
      "end_line": 847,
      "comment": "\n     * Decodes a Base64 String into octets\n     *\n     * @param base64String\n     *            String containing Base64 data\n     * @return Array containing decoded data.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeBase64(byte[])",
      "begin_line": 856,
      "end_line": 858,
      "comment": "\n     * Decodes Base64 data into octets\n     * \n     * @param base64Data\n     *            Byte array containing Base64 data\n     * @return Array containing decoded data.\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.discardWhitespace(byte[])",
      "begin_line": 868,
      "end_line": 885,
      "comment": "\n     * Discards any whitespace from a base-64 encoded block.\n     * \n     * @param data\n     *            The base-64 encoded data to discard the whitespace from.\n     * @return The data, less whitespace (see RFC 2045).\n     * @deprecated This method is no longer needed\n     ",
      "child_ranges": [
        "(line 869,col 9)-(line 869,col 51)",
        "(line 870,col 9)-(line 870,col 28)",
        "(line 871,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 882,col 50)",
        "(line 883,col 9)-(line 883,col 69)",
        "(line 884,col 9)-(line 884,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isWhiteSpace(byte)",
      "begin_line": 894,
      "end_line": 904,
      "comment": "\n     * Checks if a byte value is whitespace or not.\n     * \n     * @param byteToCheck\n     *            the byte to check\n     * @return true if byte is whitespace, false otherwise\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 903,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(java.lang.Object)",
      "begin_line": 918,
      "end_line": 923,
      "comment": "\n     * Encodes an Object using the base64 algorithm. This method is provided in order to satisfy the requirements of the\n     * Encoder interface, and will throw an EncoderException if the supplied object is not of type byte[].\n     * \n     * @param pObject\n     *            Object to encode\n     * @return An object (of type byte[]) containing the base64 encoded data which corresponds to the byte[] supplied.\n     * @throws EncoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 919,col 9)-(line 921,col 9)",
        "(line 922,col 9)-(line 922,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeToString(byte[])",
      "begin_line": 933,
      "end_line": 935,
      "comment": "\n     * Encodes a byte[] containing binary data, into a String containing characters in the Base64 alphabet.\n     *\n     * @param pArray\n     *            a byte array containing binary data\n     * @return A String containing only Base64 character data\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(byte[])",
      "begin_line": 944,
      "end_line": 966,
      "comment": "\n     * Encodes a byte[] containing binary data, into a byte[] containing characters in the Base64 alphabet.\n     * \n     * @param pArray\n     *            a byte array containing binary data\n     * @return A byte array containing only Base64 character data\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 16)",
        "(line 946,col 9)-(line 948,col 9)",
        "(line 949,col 9)-(line 949,col 70)",
        "(line 950,col 9)-(line 950,col 41)",
        "(line 951,col 9)-(line 951,col 45)",
        "(line 952,col 9)-(line 952,col 41)",
        "(line 953,col 9)-(line 953,col 30)",
        "(line 955,col 9)-(line 957,col 9)",
        "(line 960,col 9)-(line 964,col 9)",
        "(line 965,col 9)-(line 965,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.getEncodeLength(byte[], int, byte[])",
      "begin_line": 979,
      "end_line": 996,
      "comment": "\n     * Pre-calculates the amount of space needed to base64-encode the supplied array.\n     *\n     * @param pArray byte[] array which will later be encoded\n     * @param chunkSize line-length of the output (\u003c\u003d 0 means no chunking) between each\n     *        chunkSeparator (e.g. CRLF).\n     * @param chunkSeparator the sequence of bytes used to separate chunks of output (e.g. CRLF).\n     *\n     * @return amount of space needed to encoded the supplied array.  Returns\n     *         a long since a max-len array will require Integer.MAX_VALUE + 33%.\n     ",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 40)",
        "(line 983,col 9)-(line 983,col 43)",
        "(line 984,col 9)-(line 984,col 27)",
        "(line 985,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 994,col 9)",
        "(line 995,col 9)-(line 995,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeInteger(byte[])",
      "begin_line": 1007,
      "end_line": 1009,
      "comment": "\n     * Decodes a byte64-encoded integer according to crypto standards such as W3C\u0027s XML-Signature\n     * \n     * @param pArray\n     *            a byte array containing base64 character data\n     * @return A BigInteger\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeInteger(java.math.BigInteger)",
      "begin_line": 1021,
      "end_line": 1026,
      "comment": "\n     * Encodes to a byte64-encoded integer according to crypto standards such as W3C\u0027s XML-Signature\n     * \n     * @param bigInt\n     *            a BigInteger\n     * @return A byte array containing base64 character data\n     * @throws NullPointerException\n     *             if null is passed in\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 1022,col 9)-(line 1024,col 9)",
        "(line 1025,col 9)-(line 1025,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.toIntegerBytes(java.math.BigInteger)",
      "begin_line": 1035,
      "end_line": 1057,
      "comment": "\n     * Returns a byte-array representation of a \u003ccode\u003eBigInteger\u003c/code\u003e without sign bit.\n     * \n     * @param bigInt\n     *            \u003ccode\u003eBigInteger\u003c/code\u003e to be converted\n     * @return a byte array representation of the BigInteger parameter\n     ",
      "child_ranges": [
        "(line 1036,col 9)-(line 1036,col 40)",
        "(line 1038,col 9)-(line 1038,col 42)",
        "(line 1039,col 9)-(line 1039,col 47)",
        "(line 1041,col 9)-(line 1043,col 9)",
        "(line 1045,col 9)-(line 1045,col 25)",
        "(line 1046,col 9)-(line 1046,col 34)",
        "(line 1049,col 9)-(line 1052,col 9)",
        "(line 1053,col 9)-(line 1053,col 40)",
        "(line 1054,col 9)-(line 1054,col 51)",
        "(line 1055,col 9)-(line 1055,col 74)",
        "(line 1056,col 9)-(line 1056,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.reset()",
      "begin_line": 1062,
      "end_line": 1069,
      "comment": "\n     * Resets this Base64 object to its initial newly constructed state.\n     ",
      "child_ranges": [
        "(line 1063,col 9)-(line 1063,col 22)",
        "(line 1064,col 9)-(line 1064,col 16)",
        "(line 1065,col 9)-(line 1065,col 20)",
        "(line 1066,col 9)-(line 1066,col 27)",
        "(line 1067,col 9)-(line 1067,col 20)",
        "(line 1068,col 9)-(line 1068,col 20)"
      ]
    }
  ]
}