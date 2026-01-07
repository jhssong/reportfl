{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/archivers/zip/ZipLong.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipLong",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 214,
      "comment": "\n * Utility class that represents a four byte integer with conversion\n * rules for the little endian byte order of ZIP files.\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Central File Header Signature "
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Local File Header Signature "
    },
    {
      "type": "field",
      "varNames": [
        "DD_SIG"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Data Descriptor signature.\n     *\n     * \u003cp\u003eActually, PKWARE uses this as marker for split/spanned\n     * archives and other archivers have started to use it as Data\n     * Descriptor signature (as well).\u003c/p\u003e\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_MAGIC"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Value stored in size and similar fields if ZIP64 extensions are\n     * used.\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SINGLE_SEGMENT_SPLIT_MARKER"
      ],
      "begin_line": 67,
      "end_line": 68,
      "comment": "\n     * Marks ZIP archives that were supposed to be split or spanned\n     * but only needed a single segment in then end (so are actually\n     * neither split nor spanned).\n     *\n     * \u003cp\u003eThis is the \"PK00\" prefix found in some archives.\u003c/p\u003e\n     * @since 1.5\n     "
    },
    {
      "type": "field",
      "varNames": [
        "AED_SIG"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Archive extra data record signature.\n     * @since 1.5\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(long)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Create instance from a number.\n     * @param value the long to store as a ZipLong\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(int)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * create instance from a java int.\n      * @param value\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(byte[])",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Create instance from bytes.\n     * @param bytes the bytes to store as a ZipLong\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(byte[], int)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Create instance from the four bytes starting at offset.\n     * @param bytes the bytes to store as a ZipLong\n     * @param offset the offset to start\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getBytes()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Get value as four bytes in big endian byte order.\n     * @return value as four bytes in big endian order\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Get value as Java long.\n     * @return value as a long\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getIntValue()",
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * Get value as a (signed) java int\n     * @return\n     ",
      "child_ranges": [
        "(line 129,col 32)-(line 129,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getBytes(long)",
      "begin_line": 136,
      "end_line": 140,
      "comment": "\n     * Get value as four bytes in big endian byte order.\n     * @param value the value to convert\n     * @return value as four bytes in big endian byte order\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 45)",
        "(line 138,col 9)-(line 138,col 34)",
        "(line 139,col 9)-(line 139,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.putLong(long, byte[], int)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.putLong(byte[], int)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue(byte[], int)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Helper method to get the value as a Java long from four bytes starting at given array offset\n     * @param bytes the array of bytes\n     * @param offset the offset to start\n     * @return the corresponding Java long value\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue(byte[])",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Helper method to get the value as a Java long from a four-byte array\n     * @param bytes the array of bytes\n     * @return the corresponding Java long value\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.equals(java.lang.Object)",
      "begin_line": 183,
      "end_line": 189,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @param o an object to compare\n     * @return true if the objects are equal\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.hashCode()",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @return the value stored in the ZipLong\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.clone()",
      "begin_line": 200,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.toString()",
      "begin_line": 210,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 41)"
      ]
    }
  ]
}