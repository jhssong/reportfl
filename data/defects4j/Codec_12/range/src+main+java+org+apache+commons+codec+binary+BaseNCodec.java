{
  "filepath": "/tmp/Codec-12b/src/main/java/org/apache/commons/codec/binary/BaseNCodec.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseNCodec",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.BinaryEncoder",
        "org.apache.commons.codec.BinaryDecoder"
      ],
      "begin_line": 33,
      "end_line": 451,
      "comment": "\n * Abstract superclass for Base-N encoders and decoders.\n *\n * \u003cp\u003e\n * This class is not thread-safe.\n * Each thread should use its own instance.\n * \u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "EOF"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * EOF\n     * \n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MIME_CHUNK_SIZE"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     *  MIME chunk size per RFC 2045 section 6.8.\n     *\n     * \u003cp\u003e\n     * The {@value} character limit does not count the trailing CRLF, but counts all other characters, including any\n     * equal signs.\n     * \u003c/p\u003e\n     *\n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 6.8\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PEM_CHUNK_SIZE"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * PEM chunk size per RFC 1421 section 4.3.2.4.\n     *\n     * \u003cp\u003e\n     * The {@value} character limit does not count the trailing CRLF, but counts all other characters, including any\n     * equal signs.\n     * \u003c/p\u003e\n     *\n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc1421\"\u003eRFC 1421 section 4.3.2.4\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BUFFER_RESIZE_FACTOR"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BUFFER_SIZE"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Defines the default buffer size - currently {@value}\n     * - must be large enough for at least one encoded block+separator\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_8BITS"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Mask used to extract 8 bits, used in decoding bytes "
    },
    {
      "type": "field",
      "varNames": [
        "PAD_DEFAULT"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Allow static access to default"
    },
    {
      "type": "field",
      "varNames": [
        "PAD"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " instance variable just in case it needs to vary later"
    },
    {
      "type": "field",
      "varNames": [
        "unencodedBlockSize"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Number of bytes in each full block of unencoded data, e.g. 4 for Base64 and 5 for Base32 "
    },
    {
      "type": "field",
      "varNames": [
        "encodedBlockSize"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Number of bytes in each full block of encoded data, e.g. 3 for Base64 and 8 for Base32 "
    },
    {
      "type": "field",
      "varNames": [
        "lineLength"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Chunksize for encoding. Not used when decoding. \n     * A value of zero or less implies no chunking of the encoded data.\n     * Rounded down to nearest multiple of encodedBlockSize.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "chunkSeparatorLength"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Size of chunk separator. Not used unless {@link #lineLength} \u003e 0. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Buffer for streaming.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * Position where next character should be written in the buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "readPos"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Position where next character should be read from the buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "eof"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Boolean flag to indicate the EOF has been reached. Once EOF has been reached, this object becomes useless,\n     * and must be thrown away.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "currentLinePos"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * Variable tracks how many characters have been written to the current line. Only used when encoding. We use it to\n     * make sure each encoded line never goes beyond lineLength (if lineLength \u003e 0).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "modulus"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Writes to the buffer only occur after every 3/5 reads when encoding, and every 4/8 reads when decoding.\n     * This variable helps track that.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.BaseNCodec(int, int, int, int)",
      "begin_line": 143,
      "end_line": 148,
      "comment": "\n     * Note \u003ccode\u003elineLength\u003c/code\u003e is rounded down to the nearest multiple of {@link #encodedBlockSize}\n     * If \u003ccode\u003echunkSeparatorLength\u003c/code\u003e is zero, then chunking is disabled.\n     * @param unencodedBlockSize the size of an unencoded block (e.g. Base64 \u003d 3)\n     * @param encodedBlockSize the size of an encoded block (e.g. Base64 \u003d 4)\n     * @param lineLength if \u0026gt; 0, use chunking with a length \u003ccode\u003elineLength\u003c/code\u003e\n     * @param chunkSeparatorLength the chunk separator length, if relevant\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 53)",
        "(line 145,col 9)-(line 145,col 49)",
        "(line 146,col 9)-(line 146,col 129)",
        "(line 147,col 9)-(line 147,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.hasData()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Returns true if this object has buffered data for reading.\n     *\n     * @return true if there is data still available for reading.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.available()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Returns the amount of buffered data available for reading.\n     *\n     * @return The amount of buffered data available for reading.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.getDefaultBufferSize()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Get the default buffer size. Can be overridden.\n     *\n     * @return {@link #DEFAULT_BUFFER_SIZE}\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.resizeBuffer()",
      "begin_line": 178,
      "end_line": 188,
      "comment": " Increases our buffer by the {@link #DEFAULT_BUFFER_RESIZE_FACTOR}. ",
      "child_ranges": [
        "(line 179,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.ensureBufferSize(int)",
      "begin_line": 195,
      "end_line": 199,
      "comment": "\n     * Ensure that the buffer has room for \u003ccode\u003esize\u003c/code\u003e bytes\n     *\n     * @param size minimum spare space required\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.readResults(byte[], int, int)",
      "begin_line": 213,
      "end_line": 224,
      "comment": "\n     * Extracts buffered data into the provided byte[] array, starting at position bPos, \n     * up to a maximum of bAvail bytes. Returns how many bytes were actually extracted.\n     *\n     * @param b\n     *            byte[] array to extract the buffered data into.\n     * @param bPos\n     *            position in byte[] array to start extraction at.\n     * @param bAvail\n     *            amount of bytes we\u0027re allowed to extract. We may extract fewer (if fewer are available).\n     * @return The number of bytes successfully extracted into the provided byte[] array.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.isWhiteSpace(byte)",
      "begin_line": 233,
      "end_line": 243,
      "comment": "\n     * Checks if a byte value is whitespace or not.\n     * Whitespace is taken to mean: space, tab, CR, LF\n     * @param byteToCheck\n     *            the byte to check\n     * @return true if byte is whitespace, false otherwise\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.reset()",
      "begin_line": 248,
      "end_line": 255,
      "comment": "\n     * Resets this object to its initial newly constructed state.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 22)",
        "(line 250,col 9)-(line 250,col 16)",
        "(line 251,col 9)-(line 251,col 20)",
        "(line 252,col 9)-(line 252,col 27)",
        "(line 253,col 9)-(line 253,col 20)",
        "(line 254,col 9)-(line 254,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.encode(java.lang.Object)",
      "begin_line": 267,
      "end_line": 272,
      "comment": "\n     * Encodes an Object using the Base-N algorithm. This method is provided in order to satisfy the requirements of the\n     * Encoder interface, and will throw an EncoderException if the supplied object is not of type byte[].\n     *\n     * @param pObject\n     *            Object to encode\n     * @return An object (of type byte[]) containing the Base-N encoded data which corresponds to the byte[] supplied.\n     * @throws EncoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.encodeToString(byte[])",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * Encodes a byte[] containing binary data, into a String containing characters in the Base-N alphabet.\n     *\n     * @param pArray\n     *            a byte array containing binary data\n     * @return A String containing only Base-N character data\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.decode(java.lang.Object)",
      "begin_line": 295,
      "end_line": 303,
      "comment": "\n     * Decodes an Object using the Base-N algorithm. This method is provided in order to satisfy the requirements of the\n     * Decoder interface, and will throw a DecoderException if the supplied object is not of type byte[] or String.\n     *\n     * @param pObject\n     *            Object to decode\n     * @return An object (of type byte[]) containing the binary data which corresponds to the byte[] or String supplied.\n     * @throws DecoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.decode(java.lang.String)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Decodes a String containing characters in the Base-N alphabet.\n     *\n     * @param pArray\n     *            A String containing Base-N character data\n     * @return a byte array containing binary data\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.decode(byte[])",
      "begin_line": 323,
      "end_line": 333,
      "comment": "\n     * Decodes a byte[] containing characters in the Base-N alphabet.\n     * \n     * @param pArray\n     *            A byte array containing Base-N character data\n     * @return a byte array containing binary data\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 16)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 41)",
        "(line 329,col 9)-(line 329,col 31)",
        "(line 330,col 9)-(line 330,col 38)",
        "(line 331,col 9)-(line 331,col 46)",
        "(line 332,col 9)-(line 332,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.encode(byte[])",
      "begin_line": 342,
      "end_line": 352,
      "comment": "\n     * Encodes a byte[] containing binary data, into a byte[] containing characters in the alphabet.\n     *\n     * @param pArray\n     *            a byte array containing binary data\n     * @return A byte array containing only the basen alphabetic character data\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 16)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 41)",
        "(line 348,col 9)-(line 348,col 31)",
        "(line 349,col 9)-(line 349,col 45)",
        "(line 350,col 9)-(line 350,col 40)",
        "(line 351,col 9)-(line 351,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.encodeAsString(byte[])",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * Encodes a byte[] containing binary data, into a String containing characters in the appropriate alphabet.\n     * Uses UTF8 encoding.\n     *\n     * @param pArray a byte array containing binary data\n     * @return String containing only character data in the appropriate alphabet.\n    ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.encode(byte[], int, int)",
      "begin_line": 365,
      "end_line": 365,
      "comment": " package protected for access from I/O streams",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.decode(byte[], int, int)",
      "begin_line": 367,
      "end_line": 367,
      "comment": " package protected for access from I/O streams",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.isInAlphabet(byte)",
      "begin_line": 377,
      "end_line": 377,
      "comment": "\n     * Returns whether or not the \u003ccode\u003eoctet\u003c/code\u003e is in the current alphabet.\n     * Does not allow whitespace or pad.\n     *\n     * @param value The value to test\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the value is defined in the current alphabet, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.isInAlphabet(byte[], boolean)",
      "begin_line": 389,
      "end_line": 397,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the alphabet.\n     * The method optionally treats whitespace and pad as valid.\n     *\n     * @param arrayOctet byte array to test\n     * @param allowWSPad if \u003ccode\u003etrue\u003c/code\u003e, then whitespace and PAD are also allowed\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all bytes are valid characters in the alphabet or if the byte array is empty;\n     *         \u003ccode\u003efalse\u003c/code\u003e, otherwise\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.isInAlphabet(java.lang.String)",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\n     * Tests a given String to see if it contains only valid characters within the alphabet. \n     * The method treats whitespace and PAD as valid.\n     *\n     * @param basen String to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all characters in the String are valid characters in the alphabet or if\n     *         the String is empty; \u003ccode\u003efalse\u003c/code\u003e, otherwise\n     * @see #isInAlphabet(byte[], boolean)\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.containsAlphabetOrPad(byte[])",
      "begin_line": 421,
      "end_line": 431,
      "comment": "\n     * Tests a given byte array to see if it contains any characters within the alphabet or PAD.\n     *\n     * Intended for use in checking line-ending arrays\n     *\n     * @param arrayOctet\n     *            byte array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if any byte is a valid character in the alphabet or PAD; \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.getEncodedLength(byte[])",
      "begin_line": 441,
      "end_line": 450,
      "comment": "\n     * Calculates the amount of space needed to encode the supplied array.\n     *\n     * @param pArray byte[] array which will later be encoded\n     *\n     * @return amount of space needed to encoded the supplied array.  \n     * Returns a long since a max-len array will require \u003e Integer.MAX_VALUE\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 108)",
        "(line 445,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 19)"
      ]
    }
  ]
}