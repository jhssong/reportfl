{
  "filepath": "/tmp/Compress-3b/src/main/java/org/apache/commons/compress/archivers/zip/ZipLong.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipLong",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 25,
      "end_line": 157,
      "comment": "\n * Utility class that represents a four byte integer with conversion\n * rules for the big endian byte order of ZIP files.\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": "private static final int BYTE_BIT_SIZE \u003d 8;"
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_MASK"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_SHIFT"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2_MASK"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2_SHIFT"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3_MASK"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3_SHIFT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Central File Header Signature "
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Local File Header Signature "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(long)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Create instance from a number.\n     * @param value the long to store as a ZipLong\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(byte[])",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Create instance from bytes.\n     * @param bytes the bytes to store as a ZipLong\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(byte[], int)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Create instance from the four bytes starting at offset.\n     * @param bytes the bytes to store as a ZipLong\n     * @param offset the offset to start\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getBytes()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Get value as four bytes in big endian byte order.\n     * @return value as four bytes in big endian order\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Get value as Java long.\n     * @return value as a long\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getBytes(long)",
      "begin_line": 97,
      "end_line": 104,
      "comment": "\n     * Get value as four bytes in big endian byte order.\n     * @param value the value to convert\n     * @return value as four bytes in big endian byte order\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 39)",
        "(line 99,col 9)-(line 99,col 49)",
        "(line 100,col 9)-(line 100,col 72)",
        "(line 101,col 9)-(line 101,col 72)",
        "(line 102,col 9)-(line 102,col 72)",
        "(line 103,col 9)-(line 103,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue(byte[], int)",
      "begin_line": 112,
      "end_line": 118,
      "comment": "\n     * Helper method to get the value as a Java long from four bytes starting at given array offset\n     * @param bytes the array of bytes\n     * @param offset the offset to start\n     * @return the correspondanding Java long value\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 76)",
        "(line 114,col 9)-(line 114,col 72)",
        "(line 115,col 9)-(line 115,col 72)",
        "(line 116,col 9)-(line 116,col 45)",
        "(line 117,col 9)-(line 117,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue(byte[])",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Helper method to get the value as a Java long from a four-byte array\n     * @param bytes the array of bytes\n     * @return the correspondanding Java long value\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.equals(java.lang.Object)",
      "begin_line": 134,
      "end_line": 139,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @param o an object to compare\n     * @return true if the objects are equal\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.hashCode()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @return the value stored in the ZipLong\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.clone()",
      "begin_line": 149,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 155,col 9)"
      ]
    }
  ]
}