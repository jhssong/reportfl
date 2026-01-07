{
  "filepath": "/tmp/Codec-9b/src/java/org/apache/commons/codec/binary/BaseNCodec.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseNCodec",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.BinaryEncoder",
        "org.apache.commons.codec.BinaryDecoder"
      ],
      "begin_line": 26,
      "end_line": 278,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MIME_CHUNK_SIZE"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     *  MIME chunk size per RFC 2045 section 6.8.\n     * \n     * \u003cp\u003e\n     * The {@value} character limit does not count the trailing CRLF, but counts all other characters, including any\n     * equal signs.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 6.8\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PEM_CHUNK_SIZE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * PEM chunk size per RFC 1421 section 4.3.2.4.\n     * \n     * \u003cp\u003e\n     * The {@value} character limit does not count the trailing CRLF, but counts all other characters, including any\n     * equal signs.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc1421\"\u003eRFC 1421 section 4.3.2.4\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BUFFER_RESIZE_FACTOR"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BUFFER_SIZE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Buffer for streaming.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Position where next character should be written in the buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "readPos"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Position where next character should be read from the buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "eof"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Boolean flag to indicate the EOF has been reached. Once EOF has been reached, this object becomes useless,\n     * and must be thrown away.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Place holder for the bytes we\u0027re dealing with for our based logic. Bitwise operations store and extract the\n     * encoding or decoding from this variable.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "currentLinePos"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Variable tracks how many characters have been written to the current line. Only used when encoding. We use it to\n     * make sure each encoded line never goes beyond lineLength (if lineLength \u003e 0).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "modulus"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * Writes to the buffer only occur after every 3/5 reads when encoding, and every 4/8 reads when decoding.\n     * This variable helps track that.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.BaseNCodec()",
      "begin_line": 94,
      "end_line": 95,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.hasData()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Returns true if this object has buffered data for reading.\n     * \n     * @return true if there is data still available for reading.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.avail()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Returns the amount of buffered data available for reading.\n     * \n     * @return The amount of buffered data available for reading.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.resizeBuffer()",
      "begin_line": 116,
      "end_line": 126,
      "comment": " Doubles our buffer. ",
      "child_ranges": [
        "(line 117,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.readResults(byte[], int, int)",
      "begin_line": 140,
      "end_line": 151,
      "comment": "\n     * Extracts buffered data into the provided byte[] array, starting at position bPos, up to a maximum of bAvail\n     * bytes. Returns how many bytes were actually extracted.\n     * \n     * @param b\n     *            byte[] array to extract the buffered data into.\n     * @param bPos\n     *            position in byte[] array to start extraction at.\n     * @param bAvail\n     *            amount of bytes we\u0027re allowed to extract. We may extract fewer (if fewer are available).\n     * @return The number of bytes successfully extracted into the provided byte[] array.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.isWhiteSpace(byte)",
      "begin_line": 160,
      "end_line": 170,
      "comment": "\n     * Checks if a byte value is whitespace or not.\n     * Whitespace is taken to mean: space, tab, CR, LF\n     * @param byteToCheck\n     *            the byte to check\n     * @return true if byte is whitespace, false otherwise\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.reset()",
      "begin_line": 175,
      "end_line": 182,
      "comment": "\n     * Resets this Base32 object to its initial newly constructed state.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 22)",
        "(line 177,col 9)-(line 177,col 16)",
        "(line 178,col 9)-(line 178,col 20)",
        "(line 179,col 9)-(line 179,col 27)",
        "(line 180,col 9)-(line 180,col 20)",
        "(line 181,col 9)-(line 181,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.encode(java.lang.Object)",
      "begin_line": 193,
      "end_line": 198,
      "comment": "\n     * Encodes an Object using the Base32 algorithm. This method is provided in order to satisfy the requirements of the\n     * Encoder interface, and will throw an EncoderException if the supplied object is not of type byte[].\n     * \n     * @param pObject\n     *            Object to encode\n     * @return An object (of type byte[]) containing the Base32 encoded data which corresponds to the byte[] supplied.\n     * @throws EncoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.encodeToString(byte[])",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Encodes a byte[] containing binary data, into a String containing characters in the Base32 alphabet.\n     *\n     * @param pArray\n     *            a byte array containing binary data\n     * @return A String containing only Base32 character data\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.decode(java.lang.Object)",
      "begin_line": 219,
      "end_line": 227,
      "comment": "\n     * Decodes an Object using the Base32 algorithm. This method is provided in order to satisfy the requirements of the\n     * Decoder interface, and will throw a DecoderException if the supplied object is not of type byte[] or String.\n     * \n     * @param pObject\n     *            Object to decode\n     * @return An object (of type byte[]) containing the binary data which corresponds to the byte[] or String supplied.\n     * @throws DecoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.decode(java.lang.String)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Decodes a String containing characters in the Base32 alphabet.\n     *\n     * @param pArray\n     *            A String containing Base32 character data\n     * @return a byte array containing binary data\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.decode(byte[])",
      "begin_line": 245,
      "end_line": 255,
      "comment": "\n     * Decodes a byte[] containing characters in the Base32 alphabet.\n     * \n     * @param pArray\n     *            A byte array containing Base32 character data\n     * @return a byte array containing binary data\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 16)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 41)",
        "(line 251,col 9)-(line 251,col 30)",
        "(line 252,col 9)-(line 252,col 38)",
        "(line 253,col 9)-(line 253,col 46)",
        "(line 254,col 9)-(line 254,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.encode(byte[])",
      "begin_line": 263,
      "end_line": 273,
      "comment": "\n     * Encodes a byte[] containing binary data, into a byte[] containing characters in the Base32 alphabet.\n     * \n     * @param pArray\n     *            a byte array containing binary data\n     * @return A byte array containing only Base32 character data\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 16)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 41)",
        "(line 269,col 9)-(line 269,col 30)",
        "(line 270,col 9)-(line 270,col 45)",
        "(line 271,col 9)-(line 271,col 40)",
        "(line 272,col 9)-(line 272,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.encode(byte[], int, int)",
      "begin_line": 275,
      "end_line": 275,
      "comment": " package protected for access from I/O streams",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodec.decode(byte[], int, int)",
      "begin_line": 277,
      "end_line": 277,
      "comment": " package protected for access from I/O streams",
      "child_ranges": []
    }
  ]
}