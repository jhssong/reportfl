{
  "filepath": "/tmp/Codec-3b/src/java/org/apache/commons/codec/binary/Base64.java",
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
      "end_line": 1047,
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
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Chunk separator per RFC 2045 section 2.1.\n     * \n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 2.1\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STANDARD_ENCODE_TABLE"
      ],
      "begin_line": 84,
      "end_line": 90,
      "comment": "\n     * This array is a lookup table that translates 6-bit positive integer index values into their \"Base64 Alphabet\"\n     * equivalents as specified in Table 1 of RFC 2045.\n     * \n     * Thanks to \"commons\" project in ws.apache.org for this code.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "URL_SAFE_ENCODE_TABLE"
      ],
      "begin_line": 97,
      "end_line": 103,
      "comment": "\n     * This is a copy of the STANDARD_ENCODE_TABLE above, but with + and /\n     * changed to - and _ to make the encoded Base64 results more URL-SAFE.\n     * This table is only used when the Base64\u0027s mode is set to URL-SAFE.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Byte used to pad output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DECODE_TABLE"
      ],
      "begin_line": 121,
      "end_line": 129,
      "comment": "\n     * This array is a lookup table that translates Unicode characters drawn from the \"Base64 Alphabet\" (as specified in\n     * Table 1 of RFC 2045) into their 6-bit positive integer equivalents. Characters that are not in the Base64\n     * alphabet but fall within the bounds of the array are translated to -1.\n     * \n     * Note: \u0027+\u0027 and \u0027-\u0027 both decode to 62. \u0027/\u0027 and \u0027_\u0027 both decode to 63. This means decoder seamlessly handles both\n     * URL_SAFE and STANDARD base64. (The encoder, on the other hand, needs to know ahead of time what to emit).\n     * \n     * Thanks to \"commons\" project in ws.apache.org for this code.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_6BITS"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " Mask used to extract 6 bits, used when encoding "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_8BITS"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " Mask used to extract 8 bits, used in decoding base64 bytes "
    },
    {
      "type": "field",
      "varNames": [
        "encodeTable"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": "\n     * Encode table to use: either STANDARD or URL_SAFE. Note: the DECODE_TABLE above remains static because it is able\n     * to decode both STANDARD and URL_SAFE streams, but the encodeTable must be a member variable so we can switch\n     * between the two modes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lineLength"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": "\n     * Line length for encoding. Not used when decoding. A value of zero or less implies no chunking of the base64\n     * encoded data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lineSeparator"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": "\n     * Line separator for encoding. Not used when decoding. Only used if lineLength \u003e 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decodeSize"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of room and needs resizing.\n     * \u003ccode\u003edecodeSize \u003d 3 + lineSeparator.length;\u003c/code\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encodeSize"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of room and needs resizing.\n     * \u003ccode\u003eencodeSize \u003d 4 + lineSeparator.length;\u003c/code\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": "\n     * Buffer for streaming.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": "\n     * Position where next character should be written in the buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "readPos"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": "\n     * Position where next character should be read from the buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "currentLinePos"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": "\n     * Variable tracks how many characters have been written to the current line. Only used when encoding. We use it to\n     * make sure each encoded line never goes beyond lineLength (if lineLength \u003e 0).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "modulus"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": "\n     * Writes to the buffer only occur after every 3 reads when encoding, an every 4 reads when decoding. This variable\n     * helps track that.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "eof"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": "\n     * Boolean flag to indicate the EOF has been reached. Once EOF has been reached, this Base64 object becomes useless,\n     * and must be thrown away.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": "\n     * Place holder for the 3 bytes we\u0027re dealing with for our base64 logic. Bitwise operations store and extract the\n     * base64 encoding or decoding from this variable.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length is 76, the line separator is CRLF, and the encoding table is STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(boolean)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in the given URL-safe mode.\n     * \u003cp\u003e\n     * When encoding the line length is 76, the line separator is CRLF, and the encoding table is STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     * \n     * @param urlSafe\n     *            if \u003ccode\u003etrue\u003c/code\u003e, URL-safe encoding is used. In most cases this should be set to\n     *            \u003ccode\u003efalse\u003c/code\u003e.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length is given in the constructor, the line separator is CRLF, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 4).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int, byte[])",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length and line separator are given in the constructor, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 4).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @throws IllegalArgumentException\n     *             Thrown when the provided lineSeparator included some base64 characters.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int, byte[], boolean)",
      "begin_line": 316,
      "end_line": 335,
      "comment": "\n     * Creates a Base64 codec used for decoding (all modes) and encoding in URL-unsafe mode.\n     * \u003cp\u003e\n     * When encoding the line length and line separator are given in the constructor, and the encoding table is\n     * STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * When decoding all variants are supported.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most of the given length (rounded down to nearest multiple of 4).\n     *            If lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @param urlSafe\n     *            Instead of emitting \u0027+\u0027 and \u0027/\u0027 we emit \u0027-\u0027 and \u0027_\u0027 respectively. urlSafe is only applied to encode\n     *            operations. Decoding seamlessly handles both modes.\n     * @throws IllegalArgumentException\n     *             The provided lineSeparator included some base64 characters. That\u0027s not going to work!\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 68)",
        "(line 322,col 9)-(line 322,col 60)",
        "(line 323,col 9)-(line 323,col 88)",
        "(line 324,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 46)",
        "(line 330,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isUrlSafe()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * Returns our current encode mode. True if we\u0027re URL-SAFE, false otherwise.\n     * \n     * @return true if we\u0027re in URL-SAFE mode, false otherwise.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.hasData()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n     * Returns true if this Base64 object has buffered data for reading.\n     * \n     * @return true if there is Base64 object still available for reading.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.avail()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * Returns the amount of buffered data available for reading.\n     * \n     * @return The amount of buffered data available for reading.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.resizeBuffer()",
      "begin_line": 366,
      "end_line": 376,
      "comment": " Doubles our buffer. ",
      "child_ranges": [
        "(line 367,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.readResults(byte[], int, int)",
      "begin_line": 390,
      "end_line": 407,
      "comment": "\n     * Extracts buffered data into the provided byte[] array, starting at position bPos, up to a maximum of bAvail\n     * bytes. Returns how many bytes were actually extracted.\n     * \n     * @param b\n     *            byte[] array to extract the buffered data into.\n     * @param bPos\n     *            position in byte[] array to start extraction at.\n     * @param bAvail\n     *            amount of bytes we\u0027re allowed to extract. We may extract fewer (if fewer are available).\n     * @return The number of bytes successfully extracted into the provided byte[] array.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.setInitialBuffer(byte[], int, int)",
      "begin_line": 420,
      "end_line": 428,
      "comment": "\n     * Sets the streaming buffer. This is a small optimization where we try to buffer directly to the consumer\u0027s output\n     * array for one round (if the consumer calls this method first) instead of starting our own buffer.\n     * \n     * @param out\n     *            byte[] array to buffer directly to.\n     * @param outPos\n     *            Position to start buffering into.\n     * @param outAvail\n     *            Amount of bytes available for direct buffering.\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 427,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(byte[], int, int)",
      "begin_line": 448,
      "end_line": 509,
      "comment": "\n     * \u003cp\u003e\n     * Encodes all of the provided data, starting at inPos, for inAvail bytes. Must be called at least twice: once with\n     * the data to encode, and once with inAvail set to \"-1\" to alert encoder that EOF has been reached, so flush last\n     * remaining bytes (if not multiple of 3).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Thanks to \"commons\" project in ws.apache.org for the bitwise operations, and general approach.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     * \u003c/p\u003e\n     * \n     * @param in\n     *            byte[] array of binary data to base64 encode.\n     * @param inPos\n     *            Position to start reading data from.\n     * @param inAvail\n     *            Amount of bytes available from input for encoding.\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)",
        "(line 454,col 9)-(line 508,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(byte[], int, int)",
      "begin_line": 534,
      "end_line": 582,
      "comment": "\n     * \u003cp\u003e\n     * Decodes all of the provided data, starting at inPos, for inAvail bytes. Should be called at least twice: once\n     * with the data to decode, and once with inAvail set to \"-1\" to alert decoder that EOF has been reached. The \"-1\"\n     * call is not necessary when decoding, but it doesn\u0027t hurt, either.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Ignores all non-base64 characters. This is how chunked (e.g. 76 character) data is handled, since CR and LF are\n     * silently ignored, but has implications for other bytes, too. This method subscribes to the garbage-in,\n     * garbage-out philosophy: it will not check the provided data for validity.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Thanks to \"commons\" project in ws.apache.org for the bitwise operations, and general approach.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     * \u003c/p\u003e\n     * \n     * @param in\n     *            byte[] array of ascii data to base64 decode.\n     * @param inPos\n     *            Position to start reading data from.\n     * @param inAvail\n     *            Amount of bytes available from input for encoding.\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 564,col 9)",
        "(line 569,col 9)-(line 581,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isBase64(byte)",
      "begin_line": 592,
      "end_line": 594,
      "comment": "\n     * Returns whether or not the \u003ccode\u003eoctet\u003c/code\u003e is in the base 64 alphabet.\n     * \n     * @param octet\n     *            The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the value is defined in the the base 64 alphabet, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isArrayByteBase64(byte[])",
      "begin_line": 605,
      "end_line": 612,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the Base64 alphabet. Currently the\n     * method treats whitespace as valid.\n     * \n     * @param arrayOctet\n     *            byte array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all bytes are valid characters in the Base64 alphabet or if the byte array is empty;\n     *         false, otherwise\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.containsBase64Byte(byte[])",
      "begin_line": 621,
      "end_line": 628,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the Base64 alphabet.\n     * \n     * @param arrayOctet\n     *            byte array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if any byte is a valid character in the Base64 alphabet; false herwise\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 627,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[])",
      "begin_line": 637,
      "end_line": 639,
      "comment": "\n     * Encodes binary data using the base64 algorithm but does not chunk the output.\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return byte[] containing Base64 characters in their UTF-8 representation.\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64String(byte[])",
      "begin_line": 648,
      "end_line": 650,
      "comment": "\n     * Encodes binary data using the base64 algorithm into 76 character blocks separated by CRLF.\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return String containing Base64 characters.\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byte[])",
      "begin_line": 661,
      "end_line": 663,
      "comment": "\n     * Encodes binary data using a URL-safe variation of the base64 algorithm but does not chunk the output. The\n     * url-safe variation emits - and _ instead of + and / characters.\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return byte[] containing Base64 characters in their UTF-8 representation.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byte[])",
      "begin_line": 674,
      "end_line": 676,
      "comment": "\n     * Encodes binary data using a URL-safe variation of the base64 algorithm but does not chunk the output. The\n     * url-safe variation emits - and _ instead of + and / characters.\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return String containing Base64 characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byte[])",
      "begin_line": 685,
      "end_line": 687,
      "comment": "\n     * Encodes binary data using the base64 algorithm and chunks the encoded output into 76 character blocks\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return Base64 characters chunked in 76 character blocks\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(java.lang.Object)",
      "begin_line": 699,
      "end_line": 707,
      "comment": "\n     * Decodes an Object using the base64 algorithm. This method is provided in order to satisfy the requirements of the\n     * Decoder interface, and will throw a DecoderException if the supplied object is not of type byte[] or String.\n     * \n     * @param pObject\n     *            Object to decode\n     * @return An object (of type byte[]) containing the binary data which corresponds to the byte[] or String supplied.\n     * @throws DecoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 706,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(java.lang.String)",
      "begin_line": 716,
      "end_line": 718,
      "comment": "\n     * Decodes a String containing containing characters in the Base64 alphabet.\n     *\n     * @param pArray\n     *            A String containing Base64 character data\n     * @return a byte array containing binary data\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(byte[])",
      "begin_line": 727,
      "end_line": 747,
      "comment": "\n     * Decodes a byte[] containing containing characters in the Base64 alphabet.\n     * \n     * @param pArray\n     *            A byte array containing Base64 character data\n     * @return a byte array containing binary data\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 16)",
        "(line 729,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 732,col 43)",
        "(line 733,col 9)-(line 733,col 41)",
        "(line 734,col 9)-(line 734,col 45)",
        "(line 735,col 9)-(line 735,col 41)",
        "(line 736,col 9)-(line 736,col 30)",
        "(line 744,col 9)-(line 744,col 38)",
        "(line 745,col 9)-(line 745,col 46)",
        "(line 746,col 9)-(line 746,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean)",
      "begin_line": 760,
      "end_line": 762,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean, boolean)",
      "begin_line": 778,
      "end_line": 780,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @param urlSafe\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will emit - and _ instead of the usual + and / characters.\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean, boolean, int)",
      "begin_line": 798,
      "end_line": 813,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @param urlSafe\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will emit - and _ instead of the usual + and / characters.\n     * @param maxResultSize\n     *            The maximum result size to accept.\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than maxResultSize\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 801,col 9)",
        "(line 803,col 9)-(line 803,col 76)",
        "(line 804,col 9)-(line 809,col 9)",
        "(line 811,col 9)-(line 811,col 95)",
        "(line 812,col 9)-(line 812,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeBase64(java.lang.String)",
      "begin_line": 822,
      "end_line": 824,
      "comment": "\n     * Decodes a Base64 String into octets\n     *\n     * @param base64String\n     *            String containing Base64 data\n     * @return Array containing decoded data.\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeBase64(byte[])",
      "begin_line": 833,
      "end_line": 835,
      "comment": "\n     * Decodes Base64 data into octets\n     * \n     * @param base64Data\n     *            Byte array containing Base64 data\n     * @return Array containing decoded data.\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.discardWhitespace(byte[])",
      "begin_line": 845,
      "end_line": 862,
      "comment": "\n     * Discards any whitespace from a base-64 encoded block.\n     * \n     * @param data\n     *            The base-64 encoded data to discard the whitespace from.\n     * @return The data, less whitespace (see RFC 2045).\n     * @deprecated This method is no longer needed\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 51)",
        "(line 847,col 9)-(line 847,col 28)",
        "(line 848,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 859,col 50)",
        "(line 860,col 9)-(line 860,col 69)",
        "(line 861,col 9)-(line 861,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isWhiteSpace(byte)",
      "begin_line": 871,
      "end_line": 881,
      "comment": "\n     * Checks if a byte value is whitespace or not.\n     * \n     * @param byteToCheck\n     *            the byte to check\n     * @return true if byte is whitespace, false otherwise\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 880,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(java.lang.Object)",
      "begin_line": 895,
      "end_line": 900,
      "comment": "\n     * Encodes an Object using the base64 algorithm. This method is provided in order to satisfy the requirements of the\n     * Encoder interface, and will throw an EncoderException if the supplied object is not of type byte[].\n     * \n     * @param pObject\n     *            Object to encode\n     * @return An object (of type byte[]) containing the base64 encoded data which corresponds to the byte[] supplied.\n     * @throws EncoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 899,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeToString(byte[])",
      "begin_line": 909,
      "end_line": 911,
      "comment": "\n     * Encodes a byte[] containing binary data, into a String containing characters in the Base64 alphabet.\n     *\n     * @param pArray\n     *            a byte array containing binary data\n     * @return A String containing only Base64 character data\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(byte[])",
      "begin_line": 920,
      "end_line": 942,
      "comment": "\n     * Encodes a byte[] containing binary data, into a byte[] containing characters in the Base64 alphabet.\n     * \n     * @param pArray\n     *            a byte array containing binary data\n     * @return A byte array containing only Base64 character data\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 16)",
        "(line 922,col 9)-(line 924,col 9)",
        "(line 925,col 9)-(line 925,col 70)",
        "(line 926,col 9)-(line 926,col 41)",
        "(line 927,col 9)-(line 927,col 45)",
        "(line 928,col 9)-(line 928,col 41)",
        "(line 929,col 9)-(line 929,col 30)",
        "(line 931,col 9)-(line 933,col 9)",
        "(line 936,col 9)-(line 940,col 9)",
        "(line 941,col 9)-(line 941,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.getEncodeLength(byte[], int, byte[])",
      "begin_line": 955,
      "end_line": 972,
      "comment": "\n     * Pre-calculates the amount of space needed to base64-encode the supplied array.\n     *\n     * @param pArray byte[] array which will later be encoded\n     * @param chunkSize line-length of the output (\u003c\u003d 0 means no chunking) between each\n     *        chunkSeparator (e.g. CRLF).\n     * @param chunkSeparator the sequence of bytes used to separate chunks of output (e.g. CRLF).\n     *\n     * @return amount of space needed to encoded the supplied array.  Returns\n     *         a long since a max-len array will require Integer.MAX_VALUE + 33%.\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 40)",
        "(line 959,col 9)-(line 959,col 43)",
        "(line 960,col 9)-(line 960,col 27)",
        "(line 961,col 9)-(line 963,col 9)",
        "(line 964,col 9)-(line 970,col 9)",
        "(line 971,col 9)-(line 971,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeInteger(byte[])",
      "begin_line": 983,
      "end_line": 985,
      "comment": "\n     * Decodes a byte64-encoded integer according to crypto standards such as W3C\u0027s XML-Signature\n     * \n     * @param pArray\n     *            a byte array containing base64 character data\n     * @return A BigInteger\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeInteger(java.math.BigInteger)",
      "begin_line": 997,
      "end_line": 1002,
      "comment": "\n     * Encodes to a byte64-encoded integer according to crypto standards such as W3C\u0027s XML-Signature\n     * \n     * @param bigInt\n     *            a BigInteger\n     * @return A byte array containing base64 character data\n     * @throws NullPointerException\n     *             if null is passed in\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 998,col 9)-(line 1000,col 9)",
        "(line 1001,col 9)-(line 1001,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.toIntegerBytes(java.math.BigInteger)",
      "begin_line": 1011,
      "end_line": 1033,
      "comment": "\n     * Returns a byte-array representation of a \u003ccode\u003eBigInteger\u003c/code\u003e without sign bit.\n     * \n     * @param bigInt\n     *            \u003ccode\u003eBigInteger\u003c/code\u003e to be converted\n     * @return a byte array representation of the BigInteger parameter\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 40)",
        "(line 1014,col 9)-(line 1014,col 42)",
        "(line 1015,col 9)-(line 1015,col 47)",
        "(line 1017,col 9)-(line 1019,col 9)",
        "(line 1021,col 9)-(line 1021,col 25)",
        "(line 1022,col 9)-(line 1022,col 34)",
        "(line 1025,col 9)-(line 1028,col 9)",
        "(line 1029,col 9)-(line 1029,col 40)",
        "(line 1030,col 9)-(line 1030,col 51)",
        "(line 1031,col 9)-(line 1031,col 74)",
        "(line 1032,col 9)-(line 1032,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.reset()",
      "begin_line": 1038,
      "end_line": 1045,
      "comment": "\n     * Resets this Base64 object to its initial newly constructed state.\n     ",
      "child_ranges": [
        "(line 1039,col 9)-(line 1039,col 22)",
        "(line 1040,col 9)-(line 1040,col 16)",
        "(line 1041,col 9)-(line 1041,col 20)",
        "(line 1042,col 9)-(line 1042,col 27)",
        "(line 1043,col 9)-(line 1043,col 20)",
        "(line 1044,col 9)-(line 1044,col 20)"
      ]
    }
  ]
}