{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/compressors/lz4/XXHash32.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XXHash32",
      "is_interface": false,
      "parent_types": [
        "java.util.zip.Checksum"
      ],
      "begin_line": 34,
      "end_line": 179,
      "comment": "\n * Implementation of the xxhash32 hash algorithm.\n *\n * @see \u003ca href\u003d\"http://cyan4973.github.io/xxHash/\"\u003exxHash\u003c/a\u003e\n * @NotThreadSafe\n * @since 1.14\n "
    },
    {
      "type": "field",
      "varNames": [
        "BUF_SIZE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ROTATE_BITS"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PRIME1"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PRIME2"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PRIME3"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PRIME4"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PRIME5"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " See: http://git-wip-us.apache.org/repos/asf/commons-compress/diff/2f56fb5c"
    },
    {
      "type": "field",
      "varNames": [
        "seed"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "totalLen"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz4.XXHash32.XXHash32()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Creates an XXHash32 instance with a seed of 0.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz4.XXHash32.XXHash32(int)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Creates an XXHash32 instance.\n     * @param seed the seed to use\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 25)",
        "(line 68,col 9)-(line 68,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.XXHash32.reset()",
      "begin_line": 71,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 26)",
        "(line 74,col 9)-(line 74,col 21)",
        "(line 75,col 9)-(line 75,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.XXHash32.update(int)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 39)",
        "(line 81,col 9)-(line 81,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.XXHash32.update(byte[], int, int)",
      "begin_line": 84,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 24)",
        "(line 91,col 9)-(line 91,col 34)",
        "(line 93,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 41)",
        "(line 107,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.XXHash32.getValue()",
      "begin_line": 118,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 17)",
        "(line 121,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 25)",
        "(line 132,col 9)-(line 132,col 20)",
        "(line 133,col 9)-(line 133,col 34)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 141,col 28)",
        "(line 142,col 9)-(line 142,col 23)",
        "(line 143,col 9)-(line 143,col 28)",
        "(line 144,col 9)-(line 144,col 23)",
        "(line 145,col 9)-(line 145,col 28)",
        "(line 146,col 9)-(line 146,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.XXHash32.getInt(byte[], int)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.XXHash32.initializeState()",
      "begin_line": 153,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 42)",
        "(line 155,col 9)-(line 155,col 33)",
        "(line 156,col 9)-(line 156,col 24)",
        "(line 157,col 9)-(line 157,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.XXHash32.process(byte[], int)",
      "begin_line": 160,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 26)",
        "(line 163,col 9)-(line 163,col 26)",
        "(line 164,col 9)-(line 164,col 26)",
        "(line 165,col 9)-(line 165,col 26)",
        "(line 167,col 9)-(line 167,col 79)",
        "(line 168,col 9)-(line 168,col 83)",
        "(line 169,col 9)-(line 169,col 83)",
        "(line 170,col 9)-(line 170,col 84)",
        "(line 172,col 9)-(line 172,col 22)",
        "(line 173,col 9)-(line 173,col 22)",
        "(line 174,col 9)-(line 174,col 22)",
        "(line 175,col 9)-(line 175,col 22)",
        "(line 177,col 9)-(line 177,col 16)"
      ]
    }
  ]
}