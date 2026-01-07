{
  "filepath": "/tmp/Compress-10b/src/main/java/org/apache/commons/compress/archivers/zip/ZipShort.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipShort",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 27,
      "end_line": 146,
      "comment": "\n * Utility class that represents a two byte integer with conversion\n * rules for the big endian byte order of ZIP files.\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_MASK"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_SHIFT"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.ZipShort(int)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * Create instance from a number.\n     * @param value the int to store as a ZipShort\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.ZipShort(byte[])",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Create instance from bytes.\n     * @param bytes the bytes to store as a ZipShort\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.ZipShort(byte[], int)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Create instance from the two bytes starting at offset.\n     * @param bytes the bytes to store as a ZipShort\n     * @param offset the offset to start\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getBytes()",
      "begin_line": 62,
      "end_line": 67,
      "comment": "\n     * Get value as two bytes in big endian byte order.\n     * @return the value as a a two byte array in big endian byte order\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 36)",
        "(line 64,col 9)-(line 64,col 47)",
        "(line 65,col 9)-(line 65,col 67)",
        "(line 66,col 9)-(line 66,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getValue()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Get value as Java int.\n     * @return value as a Java int\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getBytes(int)",
      "begin_line": 82,
      "end_line": 87,
      "comment": "\n     * Get value as two bytes in big endian byte order.\n     * @param value the Java int to convert to bytes\n     * @return the converted int as a byte array in big endian byte order\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 36)",
        "(line 84,col 9)-(line 84,col 47)",
        "(line 85,col 9)-(line 85,col 67)",
        "(line 86,col 9)-(line 86,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getValue(byte[], int)",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * Helper method to get the value as a java int from two bytes starting at given array offset\n     * @param bytes the array of bytes\n     * @param offset the offset to start\n     * @return the corresponding java int value\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 70)",
        "(line 97,col 9)-(line 97,col 45)",
        "(line 98,col 9)-(line 98,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getValue(byte[])",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Helper method to get the value as a java int from a two-byte array\n     * @param bytes the array of bytes\n     * @return the corresponding java int value\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.equals(java.lang.Object)",
      "begin_line": 115,
      "end_line": 121,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @param o an object to compare\n     * @return true if the objects are equal\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.hashCode()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @return the value stored in the ZipShort\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.clone()",
      "begin_line": 132,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.toString()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 42)"
      ]
    }
  ]
}