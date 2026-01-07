{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/archivers/zip/ZipLong.java",
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
      "end_line": 216,
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
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * create instance from a java int.\n     * @param value the int to store as a ZipLong\n     * @since 1.15\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(byte[])",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Create instance from bytes.\n     * @param bytes the bytes to store as a ZipLong\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(byte[], int)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Create instance from the four bytes starting at offset.\n     * @param bytes the bytes to store as a ZipLong\n     * @param offset the offset to start\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getBytes()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Get value as four bytes in big endian byte order.\n     * @return value as four bytes in big endian order\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Get value as Java long.\n     * @return value as a long\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getIntValue()",
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * Get value as a (signed) java int\n     * @return value as int\n     * @since 1.15\n     ",
      "child_ranges": [
        "(line 131,col 32)-(line 131,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getBytes(long)",
      "begin_line": 138,
      "end_line": 142,
      "comment": "\n     * Get value as four bytes in big endian byte order.\n     * @param value the value to convert\n     * @return value as four bytes in big endian byte order\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 45)",
        "(line 140,col 9)-(line 140,col 34)",
        "(line 141,col 9)-(line 141,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.putLong(long, byte[], int)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.putLong(byte[], int)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue(byte[], int)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Helper method to get the value as a Java long from four bytes starting at given array offset\n     * @param bytes the array of bytes\n     * @param offset the offset to start\n     * @return the corresponding Java long value\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue(byte[])",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Helper method to get the value as a Java long from a four-byte array\n     * @param bytes the array of bytes\n     * @return the corresponding Java long value\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.equals(java.lang.Object)",
      "begin_line": 185,
      "end_line": 191,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @param o an object to compare\n     * @return true if the objects are equal\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.hashCode()",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @return the value stored in the ZipLong\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.clone()",
      "begin_line": 202,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.toString()",
      "begin_line": 212,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 41)"
      ]
    }
  ]
}