{
  "filepath": "/tmp/Compress-37b/src/main/java/org/apache/commons/compress/archivers/zip/ZipEightByteInteger.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipEightByteInteger",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 234,
      "comment": "\n * Utility class that represents an eight byte integer with conversion\n * rules for the big endian byte order of ZIP files.\n * @Immutable\n *\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_MASK"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_SHIFT"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2_MASK"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2_SHIFT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3_MASK"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3_SHIFT"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_4"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_4_MASK"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_4_SHIFT"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_5"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_5_MASK"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_5_SHIFT"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_6"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_6_MASK"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_6_SHIFT"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_7"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_7_MASK"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_7_SHIFT"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LEFTMOST_BIT_SHIFT"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LEFTMOST_BIT"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZipEightByteInteger(long)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Create instance from a number.\n     * @param value the long to store as a ZipEightByteInteger\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZipEightByteInteger(java.math.BigInteger)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Create instance from a number.\n     * @param value the BigInteger to store as a ZipEightByteInteger\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZipEightByteInteger(byte[])",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Create instance from bytes.\n     * @param bytes the bytes to store as a ZipEightByteInteger\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZipEightByteInteger(byte[], int)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Create instance from the eight bytes starting at offset.\n     * @param bytes the bytes to store as a ZipEightByteInteger\n     * @param offset the offset to start\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Get value as eight bytes in big endian byte order.\n     * @return value as eight bytes in big endian order\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Get value as Java long.\n     * @return value as a long\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Get value as Java long.\n     * @return value as a long\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(long)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Get value as eight bytes in big endian byte order.\n     * @param value the value to convert\n     * @return value as eight bytes in big endian byte order\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(java.math.BigInteger)",
      "begin_line": 141,
      "end_line": 156,
      "comment": "\n     * Get value as eight bytes in big endian byte order.\n     * @param value the value to convert\n     * @return value as eight bytes in big endian byte order\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 42)",
        "(line 143,col 9)-(line 143,col 43)",
        "(line 144,col 9)-(line 144,col 47)",
        "(line 145,col 9)-(line 145,col 70)",
        "(line 146,col 9)-(line 146,col 70)",
        "(line 147,col 9)-(line 147,col 70)",
        "(line 148,col 9)-(line 148,col 70)",
        "(line 149,col 9)-(line 149,col 70)",
        "(line 150,col 9)-(line 150,col 70)",
        "(line 151,col 9)-(line 151,col 70)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byte[], int)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Helper method to get the value as a Java long from eight bytes\n     * starting at given array offset\n     * @param bytes the array of bytes\n     * @param offset the offset to start\n     * @return the corresponding Java long value\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byte[], int)",
      "begin_line": 176,
      "end_line": 188,
      "comment": "\n     * Helper method to get the value as a Java BigInteger from eight\n     * bytes starting at given array offset\n     * @param bytes the array of bytes\n     * @param offset the offset to start\n     * @return the corresponding Java BigInteger value\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 83)",
        "(line 178,col 9)-(line 178,col 79)",
        "(line 179,col 9)-(line 179,col 79)",
        "(line 180,col 9)-(line 180,col 79)",
        "(line 181,col 9)-(line 181,col 79)",
        "(line 182,col 9)-(line 182,col 79)",
        "(line 183,col 9)-(line 183,col 79)",
        "(line 184,col 9)-(line 184,col 52)",
        "(line 185,col 9)-(line 185,col 57)",
        "(line 186,col 9)-(line 187,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byte[])",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Helper method to get the value as a Java long from an eight-byte array\n     * @param bytes the array of bytes\n     * @return the corresponding Java long value\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byte[])",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Helper method to get the value as a Java long from an eight-byte array\n     * @param bytes the array of bytes\n     * @return the corresponding Java BigInteger value\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.equals(java.lang.Object)",
      "begin_line": 213,
      "end_line": 219,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @param o an object to compare\n     * @return true if the objects are equal\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.hashCode()",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @return the hashCode of the value stored in the ZipEightByteInteger\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.toString()",
      "begin_line": 230,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 53)"
      ]
    }
  ]
}