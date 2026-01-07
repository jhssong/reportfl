{
  "filepath": "/tmp/Compress-41b/src/main/java/org/apache/commons/compress/compressors/lzw/LZWInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LZWInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 36,
      "end_line": 249,
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
        "(line 64,col 9)-(line 64,col 38)",
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
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Read the next code and expand it.\n     * @return the expanded next code\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.addEntry(int, byte)",
      "begin_line": 103,
      "end_line": 104,
      "comment": "\n     * Add a new entry to the dictionary.\n     * @param previousCode the previous code\n     * @param character the next character to append\n     * @return the new code\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.setClearCode(int)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Sets the clear code based on the code size.\n     * @param codeSize code size\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.initializeTables(int)",
      "begin_line": 118,
      "end_line": 129,
      "comment": "\n     * Initializes the arrays based on the maximum code size.\n     * @param maxCodeSize maximum code size\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 50)",
        "(line 120,col 9)-(line 120,col 41)",
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 45)",
        "(line 123,col 9)-(line 123,col 43)",
        "(line 124,col 9)-(line 124,col 31)",
        "(line 125,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.readNextCode()",
      "begin_line": 136,
      "end_line": 141,
      "comment": "\n     * Reads the next code from the stream.\n     * @return the next code\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.addEntry(int, byte, int)",
      "begin_line": 151,
      "end_line": 158,
      "comment": "\n     * Adds a new entry if the maximum table size hasn\u0027t been exceeded\n     * and returns the new index.\n     * @param previousCode the previous code\n     * @param character the character to append\n     * @param maxTableSize the maximum table size\n     * @return the new code\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.addRepeatOfPreviousCode()",
      "begin_line": 165,
      "end_line": 171,
      "comment": "\n     * Add entry for repeat of previousCode we haven\u0027t added, yet.\n     * @return new code for a repeat of the previous code\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.expandCodeToOutputStack(int, boolean)",
      "begin_line": 181,
      "end_line": 192,
      "comment": "\n     * Expands the entry with index code to the output stack and may\n     * create a new entry\n     * @param code the code\n     * @param addedUnfinishedEntry whether unfinished entries have been added\n     * @return the new location of the output stack\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 28)",
        "(line 190,col 9)-(line 190,col 65)",
        "(line 191,col 9)-(line 191,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.readFromStack(byte[], int, int)",
      "begin_line": 194,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 78)",
        "(line 196,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getCodeSize()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.resetCodeSize()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.setCodeSize(int)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.incrementCodeSize()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.resetPreviousCode()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getPrefix(int)",
      "begin_line": 225,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.setPrefix(int, int)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getPrefixesLength()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getClearCode()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getTableSize()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.setTableSize(int)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 28)"
      ]
    }
  ]
}