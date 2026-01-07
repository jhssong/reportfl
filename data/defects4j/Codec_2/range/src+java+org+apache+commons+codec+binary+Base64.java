{
  "filepath": "/tmp/Codec-2b/src/java/org/apache/commons/codec/binary/Base64.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.BinaryEncoder",
        "org.apache.commons.codec.BinaryDecoder"
      ],
      "begin_line": 41,
      "end_line": 896,
      "comment": "\n * Provides Base64 encoding and decoding as defined by RFC 2045.\n * \n * \u003cp\u003e\n * This class implements section \u003ccite\u003e6.8. Base64 Content-Transfer-Encoding\u003c/cite\u003e from RFC 2045 \u003ccite\u003eMultipurpose\n * Internet Mail Extensions (MIME) Part One: Format of Internet Message Bodies\u003c/cite\u003e by Freed and Borenstein.\n * \u003c/p\u003e\n * \n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @author Apache Software Foundation\n * @since 1.0-dev\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CHUNK_SIZE"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Chunk size per RFC 2045 section 6.8.\n     * \n     * \u003cp\u003e\n     * The {@value} character limit does not count the trailing CRLF, but counts all other characters, including any\n     * equal signs.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 6.8\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CHUNK_SEPARATOR"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Chunk separator per RFC 2045 section 2.1.\n     * \n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 2.1\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STANDARD_ENCODE_TABLE"
      ],
      "begin_line": 69,
      "end_line": 75,
      "comment": "\n     * This array is a lookup table that translates 6-bit positive integer\n     * index values into their \"Base64 Alphabet\" equivalents as specified\n     * in Table 1 of RFC 2045.\n     *\n     * Thanks to \"commons\" project in ws.apache.org for this code. \n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "URL_SAFE_ENCODE_TABLE"
      ],
      "begin_line": 82,
      "end_line": 88,
      "comment": "\n     * This is a copy of the STANDARD_ENCODE_TABLE above, but with + and /\n     * changed to - and _ to make the encoded Base64 results more URL-SAFE.\n     * This table is only used when the Base64\u0027s mode is set to URL-SAFE.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Byte used to pad output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DECODE_TABLE"
      ],
      "begin_line": 109,
      "end_line": 117,
      "comment": "\n     * This array is a lookup table that translates Unicode characters\n     * drawn from the \"Base64 Alphabet\" (as specified in Table 1 of RFC 2045)\n     * into their 6-bit positive integer equivalents.  Characters that\n     * are not in the Base64 alphabet but fall within the bounds of the\n     * array are translated to -1.\n     *\n     * Note:  \u0027+\u0027 and \u0027-\u0027 both decode to 62.  \u0027/\u0027 and \u0027_\u0027 both decode to 63.\n     * This means decoder seamlessly handles both URL_SAFE and STANDARD base64.\n     * (The encoder, on the other hand, needs to know ahead of time what to emit).\n     *\n     * Thanks to \"commons\" project in ws.apache.org for this code.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/ \n     "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_6BITS"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Mask used to extract 6 bits, used when encoding "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_8BITS"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " Mask used to extract 8 bits, used in decoding base64 bytes "
    },
    {
      "type": "field",
      "varNames": [
        "encodeTable"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Encode table to use:  either STANDARD or URL_SAFE.  Note:  the DECODE_TABLE above remains static\n     * because it is able to decode both STANDARD and URL_SAFE streams, but the encodeTable must be a member\n     * variable so we can switch between the two modes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lineLength"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * Line length for encoding.  Not used when decoding.  A value of zero or less implies\n     * no chunking of the base64 encoded data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lineSeparator"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": "\n     * Line separator for encoding.  Not used when decoding.  Only used if lineLength \u003e 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decodeSize"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of\n     * room and needs resizing.  \u003ccode\u003edecodeSize \u003d 3 + lineSeparator.length;\u003c/code\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encodeSize"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": "\n     * Convenience variable to help us determine when our buffer is going to run out of\n     * room and needs resizing.  \u003ccode\u003eencodeSize \u003d 4 + lineSeparator.length;\u003c/code\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n     * Buffer for streaming. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": "\n     * Position where next character should be written in the buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "readPos"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": "\n     * Position where next character should be read from the buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "currentLinePos"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": "\n     * Variable tracks how many characters have been written to the current line.\n     * Only used when encoding.  We use it to make sure each encoded line never\n     * goes beyond lineLength (if lineLength \u003e 0).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "modulus"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": "\n     * Writes to the buffer only occur after every 3 reads when encoding, an\n     * every 4 reads when decoding.  This variable helps track that.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "eof"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": "\n     * Boolean flag to indicate the EOF has been reached.  Once EOF has been\n     * reached, this Base64 object becomes useless, and must be thrown away.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": "\n     * Place holder for the 3 bytes we\u0027re dealing with for our base64 logic.\n     * Bitwise operations store and extract the base64 encoding or decoding from\n     * this variable.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Sets state for decoding and encoding.\n     * \u003cp\u003e\n     * When encoding the line length is 76, the line separator is CRLF, and we use the STANDARD_ENCODE_TABLE.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * When decoding all variants can be decoded.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(boolean)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Same as default constructor (line length is 76, line separator is CRLF), but URL-SAFE mode for encoding is\n     * supplied.\n     * \n     * When decoding: all variants can be decoded.\n     * \n     * @param urlSafe\n     *            true if URL-SAFE encoding should be performed. In most situations this should be set to false.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * \u003cp\u003e\n     * Sets the line length when encoding (line separator is still CRLF). All forms of data can be decoded.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Note: line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded\n     * data.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            each line of encoded data will be at most this long (rounded up to nearest multiple of 4). If\n     *            lineLength \u003c\u003d 0, then the output will not be divided into lines (chunks). Ignored when decoding.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int, byte[])",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * \u003cp\u003e\n     * Sets the line length and line separator when encoding. All forms of data can be decoded.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Note: line lengths that aren\u0027t multiples of 4 will still essentially end up being multiples of 4 in the encoded\n     * data.\n     * \u003c/p\u003e\n     * \n     * @param lineLength\n     *            Each line of encoded data will be at most this long (rounded up to nearest multiple of 4). Ignored\n     *            when decoding. If \u003c\u003d 0, then output will not be divided into lines (chunks).\n     * @param lineSeparator\n     *            Each line of encoded data will end with this sequence of bytes.\n     * @throws IllegalArgumentException\n     *             The provided lineSeparator included some base64 characters. That\u0027s not going to work!\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64.Base64(int, byte[], boolean)",
      "begin_line": 287,
      "end_line": 307,
      "comment": "\n     * \u003cp\u003e\n     * Consumer can use this constructor to choose a different lineLength,\n     * lineSeparator, and whether to use URL-SAFE mode when encoding.\n     * All forms of data can be decoded.\n     * \u003c/p\u003e\u003cp\u003e\n     * Note:  lineLengths that aren\u0027t multiples of 4 will still essentially\n     * end up being multiples of 4 in the encoded data.\n     * \u003c/p\u003e\n     * @param lineLength    Each line of encoded data will be at most this long\n     *                      (rounded up to nearest multiple of 4).  Ignored when decoding.\n     *                      If \u003c\u003d 0, then output will not be divided into lines (chunks).\n     * @param lineSeparator Each line of encoded data will end with this\n     *                      sequence of bytes.\n     *                      If lineLength \u003c\u003d 0, then the lineSeparator is not used.\n     * @param urlSafe       Instead of emitting \u0027+\u0027 and \u0027/\u0027 we emit \u0027-\u0027 and \u0027_\u0027 respectively.\n     *                      urlSafe is only applied to \"encode\" operations.  Decoding seamlessly\n     *                      handles both modes.\n     *\n     * @throws IllegalArgumentException The provided lineSeparator included\n     *                                  some base64 characters.  That\u0027s not going to work!\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 37)",
        "(line 289,col 9)-(line 289,col 60)",
        "(line 290,col 9)-(line 290,col 88)",
        "(line 291,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 46)",
        "(line 297,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isUrlSafe()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\n     * Returns our current encode mode. True if we\u0027re URL-SAFE, false otherwise.\n     * \n     * @return true if we\u0027re in URL-SAFE mode, false otherwise.\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.hasData()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n     * Returns true if this Base64 object has buffered data for reading.\n     * \n     * @return true if there is Base64 object still available for reading.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.avail()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Returns the amount of buffered data available for reading.\n     * \n     * @return The amount of buffered data available for reading.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.resizeBuf()",
      "begin_line": 337,
      "end_line": 347,
      "comment": " Doubles our buffer. ",
      "child_ranges": [
        "(line 338,col 9)-(line 346,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.readResults(byte[], int, int)",
      "begin_line": 361,
      "end_line": 378,
      "comment": "\n     * Extracts buffered data into the provided byte[] array, starting\n     * at position bPos, up to a maximum of bAvail bytes.  Returns how\n     * many bytes were actually extracted.\n     *\n     * @param b      byte[] array to extract the buffered data into.\n     * @param bPos   position in byte[] array to start extraction at.\n     * @param bAvail amount of bytes we\u0027re allowed to extract.  We may extract\n     *               fewer (if fewer are available).\n     * @return The number of bytes successfully extracted into the provided\n     *         byte[] array.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.setInitialBuffer(byte[], int, int)",
      "begin_line": 388,
      "end_line": 396,
      "comment": "\n     * Sets the streaming buffer. This is a small optimization where we try to buffer directly to the consumer\u0027s output\n     * array for one round (if the consumer calls this method first) instead of starting our own buffer.\n     * \n     * @param out byte[] array to buffer directly to.\n     * @param outPos Position to start buffering into.\n     * @param outAvail Amount of bytes available for direct buffering.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 395,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(byte[], int, int)",
      "begin_line": 414,
      "end_line": 473,
      "comment": "\n     * \u003cp\u003e\n     * Encodes all of the provided data, starting at inPos, for inAvail bytes.\n     * Must be called at least twice:  once with the data to encode, and once\n     * with inAvail set to \"-1\" to alert encoder that EOF has been reached,\n     * so flush last remaining bytes (if not multiple of 3).\n     * \u003c/p\u003e\u003cp\u003e\n     * Thanks to \"commons\" project in ws.apache.org for the bitwise operations,\n     * and general approach.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     * \u003c/p\u003e\n     *\n     * @param in byte[] array of binary data to base64 encode.\n     * @param inPos Position to start reading data from.\n     * @param inAvail Amount of bytes available from input for encoding.\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 417,col 9)",
        "(line 420,col 9)-(line 472,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(byte[], int, int)",
      "begin_line": 496,
      "end_line": 544,
      "comment": "\n     * \u003cp\u003e\n     * Decodes all of the provided data, starting at inPos, for inAvail bytes.\n     * Should be called at least twice:  once with the data to decode, and once\n     * with inAvail set to \"-1\" to alert decoder that EOF has been reached.\n     * The \"-1\" call is not necessary when decoding, but it doesn\u0027t hurt, either.\n     * \u003c/p\u003e\u003cp\u003e\n     * Ignores all non-base64 characters.  This is how chunked (e.g. 76 character)\n     * data is handled, since CR and LF are silently ignored, but has implications\n     * for other bytes, too.  This method subscribes to the garbage-in, garbage-out\n     * philosophy:  it will not check the provided data for validity.\n     * \u003c/p\u003e\u003cp\u003e\n     * Thanks to \"commons\" project in ws.apache.org for the bitwise operations,\n     * and general approach.\n     * http://svn.apache.org/repos/asf/webservices/commons/trunk/modules/util/\n     * \u003c/p\u003e\n\n     * @param in byte[] array of ascii data to base64 decode.\n     * @param inPos Position to start reading data from.\n     * @param inAvail Amount of bytes available from input for encoding.\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 526,col 9)",
        "(line 531,col 9)-(line 543,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isBase64(byte)",
      "begin_line": 553,
      "end_line": 555,
      "comment": "\n     * Returns whether or not the \u003ccode\u003eoctet\u003c/code\u003e is in the base 64 alphabet.\n     * \n     * @param octet\n     *            The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the value is defined in the the base 64 alphabet, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isArrayByteBase64(byte[])",
      "begin_line": 566,
      "end_line": 573,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the Base64 alphabet.\n     * Currently the method treats whitespace as valid.\n     * \n     * @param arrayOctet\n     *            byte array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all bytes are valid characters in the Base64 alphabet or if the byte array is\n     *         empty; false, otherwise\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.containsBase64Byte(byte[])",
      "begin_line": 582,
      "end_line": 589,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the Base64 alphabet.\n     * \n     * @param arrayOctet\n     *            byte array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if any byte is a valid character in the Base64 alphabet; false herwise\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 588,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[])",
      "begin_line": 598,
      "end_line": 600,
      "comment": "\n     * Encodes binary data using the base64 algorithm but does not chunk the output.\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return Base64 characters\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byte[])",
      "begin_line": 610,
      "end_line": 612,
      "comment": "\n     * Encodes binary data using a url-safe variation of the base64 algorithm but does not chunk the output.\n     * The url-safe variation emits - and _ instead of + and / characters.\n     *\n     * @param binaryData\n     *            binary data to encode\n     * @return Base64 characters\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byte[])",
      "begin_line": 622,
      "end_line": 624,
      "comment": "\n     * Encodes binary data using the base64 algorithm and chunks the encoded output into 76 character blocks\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return Base64 characters chunked in 76 character blocks\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(java.lang.Object)",
      "begin_line": 636,
      "end_line": 641,
      "comment": "\n     * Decodes an Object using the base64 algorithm. This method is provided in order to satisfy the requirements of the\n     * Decoder interface, and will throw a DecoderException if the supplied object is not of type byte[].\n     * \n     * @param pObject\n     *            Object to decode\n     * @return An object (of type byte[]) containing the binary data which corresponds to the byte[] supplied.\n     * @throws DecoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 640,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(byte[])",
      "begin_line": 650,
      "end_line": 652,
      "comment": "\n     * Decodes a byte[] containing containing characters in the Base64 alphabet.\n     * \n     * @param pArray\n     *            A byte array containing Base64 character data\n     * @return a byte array containing binary data\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean)",
      "begin_line": 665,
      "end_line": 667,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean, boolean)",
      "begin_line": 682,
      "end_line": 715,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     *\n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @param urlSafe\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will emit - and _ instead of the usual + and / characters.\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 686,col 95)",
        "(line 687,col 9)-(line 687,col 47)",
        "(line 688,col 9)-(line 688,col 27)",
        "(line 689,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 699,col 41)",
        "(line 700,col 9)-(line 700,col 49)",
        "(line 701,col 9)-(line 701,col 53)",
        "(line 702,col 9)-(line 702,col 38)",
        "(line 704,col 9)-(line 706,col 9)",
        "(line 709,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 714,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeBase64(byte[])",
      "begin_line": 723,
      "end_line": 738,
      "comment": "\n     * Decodes Base64 data into octets\n     *\n     * @param base64Data Byte array containing Base64 data\n     * @return Array containing decoded data.\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 727,col 34)",
        "(line 728,col 9)-(line 728,col 47)",
        "(line 729,col 9)-(line 729,col 41)",
        "(line 730,col 9)-(line 730,col 49)",
        "(line 731,col 9)-(line 731,col 53)",
        "(line 732,col 9)-(line 732,col 38)",
        "(line 735,col 9)-(line 735,col 42)",
        "(line 736,col 9)-(line 736,col 50)",
        "(line 737,col 9)-(line 737,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.discardWhitespace(byte[])",
      "begin_line": 748,
      "end_line": 765,
      "comment": "\n     * Discards any whitespace from a base-64 encoded block.\n     * \n     * @param data\n     *            The base-64 encoded data to discard the whitespace from.\n     * @return The data, less whitespace (see RFC 2045).\n     * @deprecated This method is no longer needed\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 51)",
        "(line 750,col 9)-(line 750,col 28)",
        "(line 751,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 762,col 50)",
        "(line 763,col 9)-(line 763,col 69)",
        "(line 764,col 9)-(line 764,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isWhiteSpace(byte)",
      "begin_line": 775,
      "end_line": 785,
      "comment": "\n     * Checks if a byte value is whitespace or not.\n     * \n     * @param byteToCheck\n     *            the byte to check\n     * @return true if byte is whitespace, false otherwise\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 784,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.discardNonBase64(byte[])",
      "begin_line": 795,
      "end_line": 806,
      "comment": "\n     * Discards any characters outside of the base64 alphabet, per the requirements on page 25 of RFC 2045 - \"Any\n     * characters outside of the base64 alphabet are to be ignored in base64 encoded data.\"\n     * \n     * @param data\n     *            The base-64 encoded data to groom\n     * @return The data, less non-base64 characters (see RFC 2045).\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 51)",
        "(line 797,col 9)-(line 797,col 28)",
        "(line 798,col 9)-(line 802,col 9)",
        "(line 803,col 9)-(line 803,col 50)",
        "(line 804,col 9)-(line 804,col 69)",
        "(line 805,col 9)-(line 805,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(java.lang.Object)",
      "begin_line": 820,
      "end_line": 825,
      "comment": "\n     * Encodes an Object using the base64 algorithm. This method is provided in order to satisfy the requirements of the\n     * Encoder interface, and will throw an EncoderException if the supplied object is not of type byte[].\n     * \n     * @param pObject\n     *            Object to encode\n     * @return An object (of type byte[]) containing the base64 encoded data which corresponds to the byte[] supplied.\n     * @throws EncoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 824,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(byte[])",
      "begin_line": 834,
      "end_line": 836,
      "comment": "\n     * Encodes a byte[] containing binary data, into a byte[] containing characters in the Base64 alphabet.\n     * \n     * @param pArray\n     *            a byte array containing binary data\n     * @return A byte array containing only Base64 character data\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeInteger(byte[])",
      "begin_line": 846,
      "end_line": 848,
      "comment": "\n     * Decodes a byte64-encoded integer according to crypto\n     * standards such as W3C\u0027s XML-Signature\n     * \n     * @param pArray a byte array containing base64 character data\n     * @return A BigInteger\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeInteger(java.math.BigInteger)",
      "begin_line": 858,
      "end_line": 863,
      "comment": "\n     * Encodes to a byte64-encoded integer according to crypto\n     * standards such as W3C\u0027s XML-Signature\n     * \n     * @param bigInt a BigInteger\n     * @return A byte array containing base64 character data\n     * @throws NullPointerException if null is passed in\n     ",
      "child_ranges": [
        "(line 859,col 9)-(line 861,col 9)",
        "(line 862,col 9)-(line 862,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.toIntegerBytes(java.math.BigInteger)",
      "begin_line": 872,
      "end_line": 895,
      "comment": "\n     * Returns a byte-array representation of a \u003ccode\u003eBigInteger\u003c/code\u003e\n     * without sign bit.\n     *\n     * @param bigInt \u003ccode\u003eBigInteger\u003c/code\u003e to be converted\n     * @return a byte array representation of the BigInteger parameter\n     ",
      "child_ranges": [
        "(line 873,col 9)-(line 873,col 40)",
        "(line 875,col 9)-(line 875,col 42)",
        "(line 876,col 9)-(line 876,col 47)",
        "(line 878,col 9)-(line 881,col 9)",
        "(line 883,col 9)-(line 883,col 25)",
        "(line 884,col 9)-(line 884,col 34)",
        "(line 887,col 9)-(line 890,col 9)",
        "(line 891,col 9)-(line 891,col 40)",
        "(line 892,col 9)-(line 892,col 51)",
        "(line 893,col 9)-(line 893,col 74)",
        "(line 894,col 9)-(line 894,col 28)"
      ]
    }
  ]
}