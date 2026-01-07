{
  "filepath": "/tmp/Compress-7b/src/main/java/org/apache/commons/compress/archivers/zip/ZipShort.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipShort",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 25,
      "end_line": 137,
      "comment": "\n * Utility class that represents a two byte integer with conversion\n * rules for the big endian byte order of ZIP files.\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_MASK"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_SHIFT"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.ZipShort(int)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Create instance from a number.\n     * @param value the int to store as a ZipShort\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.ZipShort(byte[])",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Create instance from bytes.\n     * @param bytes the bytes to store as a ZipShort\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.ZipShort(byte[], int)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Create instance from the two bytes starting at offset.\n     * @param bytes the bytes to store as a ZipShort\n     * @param offset the offset to start\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getBytes()",
      "begin_line": 61,
      "end_line": 66,
      "comment": "\n     * Get value as two bytes in big endian byte order.\n     * @return the value as a a two byte array in big endian byte order\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 36)",
        "(line 63,col 9)-(line 63,col 47)",
        "(line 64,col 9)-(line 64,col 67)",
        "(line 65,col 9)-(line 65,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getValue()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Get value as Java int.\n     * @return value as a Java int\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getBytes(int)",
      "begin_line": 81,
      "end_line": 86,
      "comment": "\n     * Get value as two bytes in big endian byte order.\n     * @param value the Java int to convert to bytes\n     * @return the converted int as a byte array in big endian byte order\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 36)",
        "(line 83,col 9)-(line 83,col 47)",
        "(line 84,col 9)-(line 84,col 67)",
        "(line 85,col 9)-(line 85,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getValue(byte[], int)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * Helper method to get the value as a java int from two bytes starting at given array offset\n     * @param bytes the array of bytes\n     * @param offset the offset to start\n     * @return the correspondanding java int value\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 70)",
        "(line 96,col 9)-(line 96,col 45)",
        "(line 97,col 9)-(line 97,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getValue(byte[])",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Helper method to get the value as a java int from a two-byte array\n     * @param bytes the array of bytes\n     * @return the correspondanding java int value\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.equals(java.lang.Object)",
      "begin_line": 114,
      "end_line": 119,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @param o an object to compare\n     * @return true if the objects are equal\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.hashCode()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @return the value stored in the ZipShort\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.clone()",
      "begin_line": 129,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 135,col 9)"
      ]
    }
  ]
}