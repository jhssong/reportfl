{
  "filepath": "/tmp/Compress-14b/src/main/java/org/apache/commons/compress/archivers/zip/ZipEightByteInteger.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipEightByteInteger",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 232,
      "comment": "\n * Utility class that represents an eight byte integer with conversion\n * rules for the big endian byte order of ZIP files.\n * @Immutable\n *\n * @since Apache Commons Compress 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_MASK"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_SHIFT"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2_MASK"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2_SHIFT"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3_MASK"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3_SHIFT"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_4"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_4_MASK"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_4_SHIFT"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_5"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_5_MASK"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_5_SHIFT"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_6"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_6_MASK"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_6_SHIFT"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_7"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_7_MASK"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_7_SHIFT"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LEFTMOST_BIT_SHIFT"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LEFTMOST_BIT"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZipEightByteInteger(long)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Create instance from a number.\n     * @param value the long to store as a ZipEightByteInteger\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZipEightByteInteger(java.math.BigInteger)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Create instance from a number.\n     * @param value the BigInteger to store as a ZipEightByteInteger\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZipEightByteInteger(byte[])",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Create instance from bytes.\n     * @param bytes the bytes to store as a ZipEightByteInteger\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZipEightByteInteger(byte[], int)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Create instance from the eight bytes starting at offset.\n     * @param bytes the bytes to store as a ZipEightByteInteger\n     * @param offset the offset to start\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Get value as eight bytes in big endian byte order.\n     * @return value as eight bytes in big endian order\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Get value as Java long.\n     * @return value as a long\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Get value as Java long.\n     * @return value as a long\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(long)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Get value as eight bytes in big endian byte order.\n     * @param value the value to convert\n     * @return value as eight bytes in big endian byte order\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(java.math.BigInteger)",
      "begin_line": 139,
      "end_line": 154,
      "comment": "\n     * Get value as eight bytes in big endian byte order.\n     * @param value the value to convert\n     * @return value as eight bytes in big endian byte order\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 36)",
        "(line 141,col 9)-(line 141,col 37)",
        "(line 142,col 9)-(line 142,col 47)",
        "(line 143,col 9)-(line 143,col 70)",
        "(line 144,col 9)-(line 144,col 70)",
        "(line 145,col 9)-(line 145,col 70)",
        "(line 146,col 9)-(line 146,col 70)",
        "(line 147,col 9)-(line 147,col 70)",
        "(line 148,col 9)-(line 148,col 70)",
        "(line 149,col 9)-(line 149,col 70)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byte[], int)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Helper method to get the value as a Java long from eight bytes\n     * starting at given array offset\n     * @param bytes the array of bytes\n     * @param offset the offset to start\n     * @return the corresponding Java long value\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byte[], int)",
      "begin_line": 174,
      "end_line": 186,
      "comment": "\n     * Helper method to get the value as a Java BigInteger from eight\n     * bytes starting at given array offset\n     * @param bytes the array of bytes\n     * @param offset the offset to start\n     * @return the corresponding Java BigInteger value\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 83)",
        "(line 176,col 9)-(line 176,col 79)",
        "(line 177,col 9)-(line 177,col 79)",
        "(line 178,col 9)-(line 178,col 79)",
        "(line 179,col 9)-(line 179,col 79)",
        "(line 180,col 9)-(line 180,col 79)",
        "(line 181,col 9)-(line 181,col 79)",
        "(line 182,col 9)-(line 182,col 52)",
        "(line 183,col 9)-(line 183,col 51)",
        "(line 184,col 9)-(line 185,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byte[])",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Helper method to get the value as a Java long from an eight-byte array\n     * @param bytes the array of bytes\n     * @return the corresponding Java long value\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byte[])",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Helper method to get the value as a Java long from an eight-byte array\n     * @param bytes the array of bytes\n     * @return the corresponding Java BigInteger value\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.equals(java.lang.Object)",
      "begin_line": 211,
      "end_line": 217,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @param o an object to compare\n     * @return true if the objects are equal\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.hashCode()",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @return the hashCode of the value stored in the ZipEightByteInteger\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEightByteInteger.toString()",
      "begin_line": 228,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 53)"
      ]
    }
  ]
}