{
  "filepath": "/tmp/Compress-22b/src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PureJavaCrc32C",
      "is_interface": false,
      "parent_types": [
        "java.util.zip.Checksum"
      ],
      "begin_line": 35,
      "end_line": 633,
      "comment": "\n * A pure-java implementation of the CRC32 checksum that uses\n * the CRC32-C polynomial, the same polynomial used by iSCSI\n * and implemented on many Intel chipsets supporting SSE4.2.\n *\n * \u003cp\u003eThis file is a copy of the implementation at the Apache Hadoop project.\u003c/p\u003e\n * @see \"http://svn.apache.org/repos/asf/hadoop/common/trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/PureJavaCrc32C.java\"\n * @NotThreadSafe\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " the current CRC value, bit-flipped "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.PureJavaCrc32C.PureJavaCrc32C()",
      "begin_line": 41,
      "end_line": 43,
      "comment": " Create a new PureJavaCrc32 object. ",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.PureJavaCrc32C.getValue()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 19)",
        "(line 47,col 5)-(line 47,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.PureJavaCrc32C.reset()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.PureJavaCrc32C.update(byte[], int, int)",
      "begin_line": 54,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 23)",
        "(line 57,col 5)-(line 75,col 5)",
        "(line 78,col 5)-(line 88,col 5)",
        "(line 91,col 5)-(line 91,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.PureJavaCrc32C.update(int)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 59)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "T8_0_start"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_1_start"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_2_start"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_3_start"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_4_start"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_5_start"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_6_start"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_7_start"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T"
      ],
      "begin_line": 111,
      "end_line": 632,
      "comment": ""
    }
  ]
}