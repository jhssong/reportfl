{
  "filepath": "/tmp/Compress-34b/src/main/java/org/apache/commons/compress/compressors/lzw/LZWInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LZWInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 36,
      "end_line": 229,
      "comment": "\n * \u003cp\u003eGeneric LZW implementation. It is used internally for\n * the Z decompressor and the Unshrinking Zip file compression method,\n * but may be useful for third-party projects in implementing their own LZW variations.\u003c/p\u003e\n *\n * @NotThreadSafe\n * @since 1.10\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CODE_SIZE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNUSED_PREFIX"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "clearCode"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeSize"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousCodeFirstChar"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousCode"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tableSize"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefixes"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "characters"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputStack"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputStackLocation"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.LZWInputStream(java.io.InputStream, java.nio.ByteOrder)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.close()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.read()",
      "begin_line": 62,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 32)",
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.read(byte[], int, int)",
      "begin_line": 71,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 51)",
        "(line 74,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 25)",
        "(line 86,col 9)-(line 86,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.decompressNextSymbol()",
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * Read the next code and expand it.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.addEntry(int, byte)",
      "begin_line": 97,
      "end_line": 98,
      "comment": "\n     * Add a new entry to the dictionary.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.setClearCode(int)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Sets the clear code based on the code size.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.initializeTables(int)",
      "begin_line": 110,
      "end_line": 121,
      "comment": "\n     * Initializes the arrays based on the maximum code size.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 50)",
        "(line 112,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 113,col 44)",
        "(line 114,col 9)-(line 114,col 45)",
        "(line 115,col 9)-(line 115,col 43)",
        "(line 116,col 9)-(line 116,col 31)",
        "(line 117,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.readNextCode()",
      "begin_line": 126,
      "end_line": 131,
      "comment": "\n     * Reads the next code from the stream.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.addEntry(int, byte, int)",
      "begin_line": 137,
      "end_line": 144,
      "comment": "\n     * Adds a new entry if the maximum table size hasn\u0027t been exceeded\n     * and returns the new index.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.addRepeatOfPreviousCode()",
      "begin_line": 149,
      "end_line": 155,
      "comment": "\n     * Add entry for repeat of previousCode we haven\u0027t added, yet.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.expandCodeToOutputStack(int, boolean)",
      "begin_line": 161,
      "end_line": 172,
      "comment": "\n     * Expands the entry with index code to the output stack and may\n     * create a new entry\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 28)",
        "(line 170,col 9)-(line 170,col 65)",
        "(line 171,col 9)-(line 171,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.readFromStack(byte[], int, int)",
      "begin_line": 174,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 72)",
        "(line 176,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getCodeSize()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.resetCodeSize()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.setCodeSize(int)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.incrementCodeSize()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.resetPreviousCode()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getPrefix(int)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.setPrefix(int, int)",
      "begin_line": 209,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getPrefixesLength()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getClearCode()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getTableSize()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.setTableSize(int)",
      "begin_line": 225,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 28)"
      ]
    }
  ]
}