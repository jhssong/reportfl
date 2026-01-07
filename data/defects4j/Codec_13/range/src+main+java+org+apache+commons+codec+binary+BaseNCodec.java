{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/binary/BaseNCodec.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseNCodec",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.BinaryEncoder",
        "org.apache.commons.codec.BinaryDecoder"
      ],
      "begin_line": 36,
      "end_line": 524,
      "comment": "\n * Abstract superclass for Base-N encoders and decoders.\n *\n * \u003cp\u003e\n * This class is thread-safe.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "Context",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 107,
      "comment": "\n     * Holds thread context so classes can be thread-safe.\n     *\n     * This class is not itself thread-safe; each thread must allocate its own copy.\n     *\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ibitWorkArea"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n         * Place holder for the bytes we\u0027re dealing with for our based logic.\n         * Bitwise operations store and extract the encoding or decoding from this variable.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "lbitWorkArea"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n         * Place holder for the bytes we\u0027re dealing with for our based logic.\n         * Bitwise operations store and extract the encoding or decoding from this variable.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n         * Buffer for streaming.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n         * Position where next character should be written in the buffer.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "readPos"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n         * Position where next character should be read from the buffer.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "eof"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n         * Boolean flag to indicate the EOF has been reached. Once EOF has been reached, this object becomes useless,\n         * and must be thrown away.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "currentLinePos"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n         * Variable tracks how many characters have been written to the current line. Only used when encoding. We use\n         * it to make sure each encoded line never goes beyond lineLength (if lineLength \u0026gt; 0).\n         "
    },
    {
      "type": "field",
      "varNames": [
        "modulus"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n         * Writes to the buffer only occur after every 3/5 reads when encoding, and every 4/8 reads when decoding. This\n         * variable helps track that.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.Context.Context()",
      "begin_line": 92,
      "end_line": 93,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.Context.toString()",
      "begin_line": 100,
      "end_line": 106,
      "comment": "\n         * Returns a String useful for debugging (especially within a debugger.)\n         *\n         * @return a String useful for debugging.\n         ",
      "child_ranges": [
        "(line 103,col 13)-(line 105,col 92)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EOF"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * EOF\n     *\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MIME_CHUNK_SIZE"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     *  MIME chunk size per RFC 2045 section 6.8.\n     *\n     * \u003cp\u003e\n     * The {@value} character limit does not count the trailing CRLF, but counts all other characters, including any\n     * equal signs.\n     * \u003c/p\u003e\n     *\n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 6.8\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PEM_CHUNK_SIZE"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * PEM chunk size per RFC 1421 section 4.3.2.4.\n     *\n     * \u003cp\u003e\n     * The {@value} character limit does not count the trailing CRLF, but counts all other characters, including any\n     * equal signs.\n     * \u003c/p\u003e\n     *\n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc1421\"\u003eRFC 1421 section 4.3.2.4\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BUFFER_RESIZE_FACTOR"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BUFFER_SIZE"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": "\n     * Defines the default buffer size - currently {@value}\n     * - must be large enough for at least one encoded block+separator\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_8BITS"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " Mask used to extract 8 bits, used in decoding bytes "
    },
    {
      "type": "field",
      "varNames": [
        "PAD_DEFAULT"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Allow static access to default"
    },
    {
      "type": "field",
      "varNames": [
        "PAD"
      ],
      "begin_line": 159,
      "end_line": 160,
      "comment": "\n     * @deprecated Use {@link #pad}. Will be removed in 2.0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pad"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " instance variable just in case it needs to vary later"
    },
    {
      "type": "field",
      "varNames": [
        "unencodedBlockSize"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " Number of bytes in each full block of unencoded data, e.g. 4 for Base64 and 5 for Base32 "
    },
    {
      "type": "field",
      "varNames": [
        "encodedBlockSize"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " Number of bytes in each full block of encoded data, e.g. 3 for Base64 and 8 for Base32 "
    },
    {
      "type": "field",
      "varNames": [
        "lineLength"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": "\n     * Chunksize for encoding. Not used when decoding.\n     * A value of zero or less implies no chunking of the encoded data.\n     * Rounded down to nearest multiple of encodedBlockSize.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "chunkSeparatorLength"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": "\n     * Size of chunk separator. Not used unless {@link #lineLength} \u0026gt; 0.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.BaseNCodec(int, int, int, int)",
      "begin_line": 190,
      "end_line": 193,
      "comment": "\n     * Note \u003ccode\u003elineLength\u003c/code\u003e is rounded down to the nearest multiple of {@link #encodedBlockSize}\n     * If \u003ccode\u003echunkSeparatorLength\u003c/code\u003e is zero, then chunking is disabled.\n     * @param unencodedBlockSize the size of an unencoded block (e.g. Base64 \u003d 3)\n     * @param encodedBlockSize the size of an encoded block (e.g. Base64 \u003d 4)\n     * @param lineLength if \u0026gt; 0, use chunking with a length \u003ccode\u003elineLength\u003c/code\u003e\n     * @param chunkSeparatorLength the chunk separator length, if relevant\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 98)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.BaseNCodec(int, int, int, int, byte)",
      "begin_line": 204,
      "end_line": 213,
      "comment": "\n     * Note \u003ccode\u003elineLength\u003c/code\u003e is rounded down to the nearest multiple of {@link #encodedBlockSize}\n     * If \u003ccode\u003echunkSeparatorLength\u003c/code\u003e is zero, then chunking is disabled.\n     * @param unencodedBlockSize the size of an unencoded block (e.g. Base64 \u003d 3)\n     * @param encodedBlockSize the size of an encoded block (e.g. Base64 \u003d 4)\n     * @param lineLength if \u0026gt; 0, use chunking with a length \u003ccode\u003elineLength\u003c/code\u003e\n     * @param chunkSeparatorLength the chunk separator length, if relevant\n     * @param pad byte used as padding byte.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 53)",
        "(line 207,col 9)-(line 207,col 49)",
        "(line 208,col 9)-(line 208,col 79)",
        "(line 209,col 9)-(line 209,col 95)",
        "(line 210,col 9)-(line 210,col 57)",
        "(line 212,col 9)-(line 212,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.hasData(org.apache.commons.codec.binary.BaseNCodec.Context)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     * Returns true if this object has buffered data for reading.\n     *\n     * @param context the context to be used\n     * @return true if there is data still available for reading.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.available(org.apache.commons.codec.binary.BaseNCodec.Context)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Returns the amount of buffered data available for reading.\n     *\n     * @param context the context to be used\n     * @return The amount of buffered data available for reading.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.getDefaultBufferSize()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Get the default buffer size. Can be overridden.\n     *\n     * @return {@link #DEFAULT_BUFFER_SIZE}\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.resizeBuffer(org.apache.commons.codec.binary.BaseNCodec.Context)",
      "begin_line": 248,
      "end_line": 259,
      "comment": "\n     * Increases our buffer by the {@link #DEFAULT_BUFFER_RESIZE_FACTOR}.\n     * @param context the context to be used\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.ensureBufferSize(int, org.apache.commons.codec.binary.BaseNCodec.Context)",
      "begin_line": 267,
      "end_line": 272,
      "comment": "\n     * Ensure that the buffer has room for \u003ccode\u003esize\u003c/code\u003e bytes\n     *\n     * @param size minimum spare space required\n     * @param context the context to be used\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.readResults(byte[], int, int, org.apache.commons.codec.binary.BaseNCodec.Context)",
      "begin_line": 290,
      "end_line": 301,
      "comment": "\n     * Extracts buffered data into the provided byte[] array, starting at position bPos, up to a maximum of bAvail\n     * bytes. Returns how many bytes were actually extracted.\n     * \u003cp\u003e\n     * Package protected for access from I/O streams.\n     *\n     * @param b\n     *            byte[] array to extract the buffered data into.\n     * @param bPos\n     *            position in byte[] array to start extraction at.\n     * @param bAvail\n     *            amount of bytes we\u0027re allowed to extract. We may extract fewer (if fewer are available).\n     * @param context\n     *            the context to be used\n     * @return The number of bytes successfully extracted into the provided byte[] array.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.isWhiteSpace(byte)",
      "begin_line": 310,
      "end_line": 320,
      "comment": "\n     * Checks if a byte value is whitespace or not.\n     * Whitespace is taken to mean: space, tab, CR, LF\n     * @param byteToCheck\n     *            the byte to check\n     * @return true if byte is whitespace, false otherwise\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 319,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.encode(java.lang.Object)",
      "begin_line": 332,
      "end_line": 338,
      "comment": "\n     * Encodes an Object using the Base-N algorithm. This method is provided in order to satisfy the requirements of\n     * the Encoder interface, and will throw an EncoderException if the supplied object is not of type byte[].\n     *\n     * @param obj\n     *            Object to encode\n     * @return An object (of type byte[]) containing the Base-N encoded data which corresponds to the byte[] supplied.\n     * @throws EncoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.encodeToString(byte[])",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\n     * Encodes a byte[] containing binary data, into a String containing characters in the Base-N alphabet.\n     * Uses UTF8 encoding.\n     *\n     * @param pArray\n     *            a byte array containing binary data\n     * @return A String containing only Base-N character data\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.encodeAsString(byte[])",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n     * Encodes a byte[] containing binary data, into a String containing characters in the appropriate alphabet.\n     * Uses UTF8 encoding.\n     *\n     * @param pArray a byte array containing binary data\n     * @return String containing only character data in the appropriate alphabet.\n    ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.decode(java.lang.Object)",
      "begin_line": 374,
      "end_line": 383,
      "comment": "\n     * Decodes an Object using the Base-N algorithm. This method is provided in order to satisfy the requirements of\n     * the Decoder interface, and will throw a DecoderException if the supplied object is not of type byte[] or String.\n     *\n     * @param obj\n     *            Object to decode\n     * @return An object (of type byte[]) containing the binary data which corresponds to the byte[] or String\n     *         supplied.\n     * @throws DecoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.decode(java.lang.String)",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n     * Decodes a String containing characters in the Base-N alphabet.\n     *\n     * @param pArray\n     *            A String containing Base-N character data\n     * @return a byte array containing binary data\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.decode(byte[])",
      "begin_line": 403,
      "end_line": 414,
      "comment": "\n     * Decodes a byte[] containing characters in the Base-N alphabet.\n     *\n     * @param pArray\n     *            A byte array containing Base-N character data\n     * @return a byte array containing binary data\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 46)",
        "(line 409,col 9)-(line 409,col 50)",
        "(line 410,col 9)-(line 410,col 40)",
        "(line 411,col 9)-(line 411,col 52)",
        "(line 412,col 9)-(line 412,col 55)",
        "(line 413,col 9)-(line 413,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.encode(byte[])",
      "begin_line": 423,
      "end_line": 434,
      "comment": "\n     * Encodes a byte[] containing binary data, into a byte[] containing characters in the alphabet.\n     *\n     * @param pArray\n     *            a byte array containing binary data\n     * @return A byte array containing only the basen alphabetic character data\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 46)",
        "(line 429,col 9)-(line 429,col 50)",
        "(line 430,col 9)-(line 430,col 40)",
        "(line 431,col 9)-(line 431,col 67)",
        "(line 432,col 9)-(line 432,col 49)",
        "(line 433,col 9)-(line 433,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.encode(byte[], int, int, org.apache.commons.codec.binary.BaseNCodec.Context)",
      "begin_line": 437,
      "end_line": 437,
      "comment": " package protected for access from I/O streams",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.decode(byte[], int, int, org.apache.commons.codec.binary.BaseNCodec.Context)",
      "begin_line": 440,
      "end_line": 440,
      "comment": " package protected for access from I/O streams",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.isInAlphabet(byte)",
      "begin_line": 450,
      "end_line": 450,
      "comment": "\n     * Returns whether or not the \u003ccode\u003eoctet\u003c/code\u003e is in the current alphabet.\n     * Does not allow whitespace or pad.\n     *\n     * @param value The value to test\n     *\n     * @return {@code true} if the value is defined in the current alphabet, {@code false} otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.isInAlphabet(byte[], boolean)",
      "begin_line": 462,
      "end_line": 470,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the alphabet.\n     * The method optionally treats whitespace and pad as valid.\n     *\n     * @param arrayOctet byte array to test\n     * @param allowWSPad if {@code true}, then whitespace and PAD are also allowed\n     *\n     * @return {@code true} if all bytes are valid characters in the alphabet or if the byte array is empty;\n     *         {@code false}, otherwise\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.isInAlphabet(java.lang.String)",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\n     * Tests a given String to see if it contains only valid characters within the alphabet.\n     * The method treats whitespace and PAD as valid.\n     *\n     * @param basen String to test\n     * @return {@code true} if all characters in the String are valid characters in the alphabet or if\n     *         the String is empty; {@code false}, otherwise\n     * @see #isInAlphabet(byte[], boolean)\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.containsAlphabetOrPad(byte[])",
      "begin_line": 494,
      "end_line": 504,
      "comment": "\n     * Tests a given byte array to see if it contains any characters within the alphabet or PAD.\n     *\n     * Intended for use in checking line-ending arrays\n     *\n     * @param arrayOctet\n     *            byte array to test\n     * @return {@code true} if any byte is a valid character in the alphabet or PAD; {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.getEncodedLength(byte[])",
      "begin_line": 514,
      "end_line": 523,
      "comment": "\n     * Calculates the amount of space needed to encode the supplied array.\n     *\n     * @param pArray byte[] array which will later be encoded\n     *\n     * @return amount of space needed to encoded the supplied array.\n     * Returns a long since a max-len array will require \u0026gt; Integer.MAX_VALUE\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 108)",
        "(line 518,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 19)"
      ]
    }
  ]
}