{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/binary/BinaryCodec.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinaryCodec",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.BinaryDecoder",
        "org.apache.commons.codec.BinaryEncoder"
      ],
      "begin_line": 36,
      "end_line": 301,
      "comment": "\n * Converts between byte arrays and strings of \"0\"s and \"1\"s.\n *\n * \u003cp\u003eThis class is immutable and thread-safe.\u003c/p\u003e\n *\n * TODO: may want to add more bit vector functions like and/or/xor/nand\n * TODO: also might be good to generate boolean[] from byte[] et cetera.\n *\n * @since 1.3\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CHAR_ARRAY"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Empty char array. "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BYTE_ARRAY"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Empty byte array. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_0"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Mask for bit 0 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_1"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Mask for bit 1 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_2"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Mask for bit 2 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_3"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Mask for bit 3 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_4"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Mask for bit 4 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_5"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Mask for bit 5 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_6"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Mask for bit 6 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BIT_7"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Mask for bit 7 of a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "BITS"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.encode(byte[])",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Converts an array of raw binary data into an array of ASCII 0 and 1 characters.\n     *\n     * @param raw\n     *                  the raw binary data to convert\n     * @return 0 and 1 ASCII character bytes one for each bit of the argument\n     * @see org.apache.commons.codec.BinaryEncoder#encode(byte[])\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.encode(java.lang.Object)",
      "begin_line": 96,
      "end_line": 102,
      "comment": "\n     * Converts an array of raw binary data into an array of ASCII 0 and 1 chars.\n     *\n     * @param raw\n     *                  the raw binary data to convert\n     * @return 0 and 1 ASCII character chars one for each bit of the argument\n     * @throws EncoderException\n     *                  if the argument is not a byte[]\n     * @see org.apache.commons.codec.Encoder#encode(Object)\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.decode(java.lang.Object)",
      "begin_line": 114,
      "end_line": 129,
      "comment": "\n     * Decodes a byte array where each byte represents an ASCII \u00270\u0027 or \u00271\u0027.\n     *\n     * @param ascii\n     *                  each byte represents an ASCII \u00270\u0027 or \u00271\u0027\n     * @return the raw encoded binary where each bit corresponds to a byte in the byte array argument\n     * @throws DecoderException\n     *                  if argument is not a byte[], char[] or String\n     * @see org.apache.commons.codec.Decoder#decode(Object)\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.decode(byte[])",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * Decodes a byte array where each byte represents an ASCII \u00270\u0027 or \u00271\u0027.\n     *\n     * @param ascii\n     *                  each byte represents an ASCII \u00270\u0027 or \u00271\u0027\n     * @return the raw encoded binary where each bit corresponds to a byte in the byte array argument\n     * @see org.apache.commons.codec.Decoder#decode(Object)\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.toByteArray(java.lang.String)",
      "begin_line": 152,
      "end_line": 157,
      "comment": "\n     * Decodes a String where each char of the String represents an ASCII \u00270\u0027 or \u00271\u0027.\n     *\n     * @param ascii\n     *                  String of \u00270\u0027 and \u00271\u0027 characters\n     * @return the raw encoded binary where each bit corresponds to a byte in the byte array argument\n     * @see org.apache.commons.codec.Decoder#decode(Object)\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.fromAscii(char[])",
      "begin_line": 171,
      "end_line": 189,
      "comment": "\n     * Decodes a char array where each char represents an ASCII \u00270\u0027 or \u00271\u0027.\n     *\n     * @param ascii\n     *                  each char represents an ASCII \u00270\u0027 or \u00271\u0027\n     * @return the raw encoded binary where each bit corresponds to a char in the char array argument\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 176,col 57)",
        "(line 181,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.fromAscii(byte[])",
      "begin_line": 198,
      "end_line": 216,
      "comment": "\n     * Decodes a byte array where each byte represents an ASCII \u00270\u0027 or \u00271\u0027.\n     *\n     * @param ascii\n     *                  each byte represents an ASCII \u00270\u0027 or \u00271\u0027\n     * @return the raw encoded binary where each bit corresponds to a byte in the byte array argument\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 203,col 57)",
        "(line 208,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.isEmpty(byte[])",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the given array is \u003ccode\u003enull\u003c/code\u003e or empty (size 0.)\n     *\n     * @param array\n     *            the source array\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the given array is \u003ccode\u003enull\u003c/code\u003e or empty (size 0.)\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.toAsciiBytes(byte[])",
      "begin_line": 238,
      "end_line": 258,
      "comment": "\n     * Converts an array of raw binary data into an array of ASCII 0 and 1 character bytes - each byte is a truncated\n     * char.\n     *\n     * @param raw\n     *                  the raw binary data to convert\n     * @return an array of 0 and 1 character bytes for each bit of the argument\n     * @see org.apache.commons.codec.BinaryEncoder#encode(byte[])\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 243,col 57)",
        "(line 248,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.toAsciiChars(byte[])",
      "begin_line": 268,
      "end_line": 288,
      "comment": "\n     * Converts an array of raw binary data into an array of ASCII 0 and 1 characters.\n     *\n     * @param raw\n     *                  the raw binary data to convert\n     * @return an array of 0 and 1 characters for each bit of the argument\n     * @see org.apache.commons.codec.BinaryEncoder#encode(byte[])\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 273,col 57)",
        "(line 278,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BinaryCodec.toAsciiString(byte[])",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Converts an array of raw binary data into a String of ASCII 0 and 1 characters.\n     *\n     * @param raw\n     *                  the raw binary data to convert\n     * @return a String of 0 and 1 characters representing the binary data\n     * @see org.apache.commons.codec.BinaryEncoder#encode(byte[])\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 45)"
      ]
    }
  ]
}