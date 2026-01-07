{
  "filepath": "/tmp/Codec-1b/src/java/org/apache/commons/codec/binary/BinaryCodec.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinaryCodec",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.BinaryDecoder",
        "org.apache.commons.codec.BinaryEncoder"
      ],
      "begin_line": 35,
      "end_line": 285,
      "comment": "\n * Translates between byte arrays and strings of \"0\"s and \"1\"s.\n * \n * TODO: may want to add more bit vector functions like and/or/xor/nand \n * TODO: also might be good to generate boolean[] from byte[] et. cetera.\n * \n * @author Apache Software Foundation\n * @since 1.3\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CHAR_ARRAY"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Empty char array. "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BYTE_ARRAY"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Empty byte array. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_0"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Mask for bit 0 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_1"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Mask for bit 1 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_2"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Mask for bit 2 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_3"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Mask for bit 3 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_4"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Mask for bit 4 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_5"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Mask for bit 5 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_6"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Mask for bit 6 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_7"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Mask for bit 7 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BITS"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.encode(byte[])",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Converts an array of raw binary data into an array of ASCII 0 and 1 characters.\n     * \n     * @param raw\n     *                  the raw binary data to convert\n     * @return 0 and 1 ASCII character bytes one for each bit of the argument\n     * @see org.apache.commons.codec.BinaryEncoder#encode(byte[])\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.encode(java.lang.Object)",
      "begin_line": 94,
      "end_line": 99,
      "comment": "\n     * Converts an array of raw binary data into an array of ASCII 0 and 1 chars.\n     * \n     * @param raw\n     *                  the raw binary data to convert\n     * @return 0 and 1 ASCII character chars one for each bit of the argument\n     * @throws EncoderException\n     *                  if the argument is not a byte[]\n     * @see org.apache.commons.codec.Encoder#encode(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.decode(java.lang.Object)",
      "begin_line": 111,
      "end_line": 125,
      "comment": "\n     * Decodes a byte array where each byte represents an ASCII \u00270\u0027 or \u00271\u0027.\n     * \n     * @param ascii\n     *                  each byte represents an ASCII \u00270\u0027 or \u00271\u0027\n     * @return the raw encoded binary where each bit corresponds to a byte in the byte array argument\n     * @throws DecoderException\n     *                  if argument is not a byte[], char[] or String\n     * @see org.apache.commons.codec.Decoder#decode(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.decode(byte[])",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Decodes a byte array where each byte represents an ASCII \u00270\u0027 or \u00271\u0027.\n     * \n     * @param ascii\n     *                  each byte represents an ASCII \u00270\u0027 or \u00271\u0027\n     * @return the raw encoded binary where each bit corresponds to a byte in the byte array argument\n     * @see org.apache.commons.codec.Decoder#decode(Object)\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.toByteArray(java.lang.String)",
      "begin_line": 147,
      "end_line": 152,
      "comment": "\n     * Decodes a String where each char of the String represents an ASCII \u00270\u0027 or \u00271\u0027.\n     * \n     * @param ascii\n     *                  String of \u00270\u0027 and \u00271\u0027 characters\n     * @return the raw encoded binary where each bit corresponds to a byte in the byte array argument\n     * @see org.apache.commons.codec.Decoder#decode(Object)\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.fromAscii(char[])",
      "begin_line": 166,
      "end_line": 184,
      "comment": "\n     * Decodes a byte array where each char represents an ASCII \u00270\u0027 or \u00271\u0027.\n     * \n     * @param ascii\n     *                  each char represents an ASCII \u00270\u0027 or \u00271\u0027\n     * @return the raw encoded binary where each bit corresponds to a char in the char array argument\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 51)",
        "(line 176,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.fromAscii(byte[])",
      "begin_line": 193,
      "end_line": 211,
      "comment": "\n     * Decodes a byte array where each byte represents an ASCII \u00270\u0027 or \u00271\u0027.\n     * \n     * @param ascii\n     *                  each byte represents an ASCII \u00270\u0027 or \u00271\u0027\n     * @return the raw encoded binary where each bit corresponds to a byte in the byte array argument\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 51)",
        "(line 203,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.toAsciiBytes(byte[])",
      "begin_line": 222,
      "end_line": 242,
      "comment": "\n     * Converts an array of raw binary data into an array of ASCII 0 and 1 character bytes - each byte is a truncated\n     * char.\n     * \n     * @param raw\n     *                  the raw binary data to convert\n     * @return an array of 0 and 1 character bytes for each bit of the argument\n     * @see org.apache.commons.codec.BinaryEncoder#encode(byte[])\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 227,col 51)",
        "(line 232,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.toAsciiChars(byte[])",
      "begin_line": 252,
      "end_line": 272,
      "comment": "\n     * Converts an array of raw binary data into an array of ASCII 0 and 1 characters.\n     * \n     * @param raw\n     *                  the raw binary data to convert\n     * @return an array of 0 and 1 characters for each bit of the argument\n     * @see org.apache.commons.codec.BinaryEncoder#encode(byte[])\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 257,col 51)",
        "(line 262,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.toAsciiString(byte[])",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Converts an array of raw binary data into a String of ASCII 0 and 1 characters.\n     * \n     * @param raw\n     *                  the raw binary data to convert\n     * @return a String of 0 and 1 characters representing the binary data\n     * @see org.apache.commons.codec.BinaryEncoder#encode(byte[])\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 45)"
      ]
    }
  ]
}