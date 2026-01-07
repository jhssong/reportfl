{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/compressors/lzw/LZWInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LZWInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 37,
      "end_line": 274,
      "comment": "\n * \u003cp\u003eGeneric LZW implementation. It is used internally for\n * the Z decompressor and the Unshrinking Zip file compression method,\n * but may be useful for third-party projects in implementing their own LZW variations.\u003c/p\u003e\n *\n * @NotThreadSafe\n * @since 1.10\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CODE_SIZE"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNUSED_PREFIX"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "clearCode"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeSize"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousCodeFirstChar"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousCode"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tableSize"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefixes"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "characters"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputStack"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputStackLocation"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.LZWInputStream(java.io.InputStream, java.nio.ByteOrder)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.close()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.read()",
      "begin_line": 63,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 38)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.read(byte[], int, int)",
      "begin_line": 72,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 51)",
        "(line 75,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 25)",
        "(line 87,col 9)-(line 87,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.decompressNextSymbol()",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Read the next code and expand it.\n     * @return the expanded next code\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.addEntry(int, byte)",
      "begin_line": 104,
      "end_line": 105,
      "comment": "\n     * Add a new entry to the dictionary.\n     * @param previousCode the previous code\n     * @param character the next character to append\n     * @return the new code\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.setClearCode(int)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Sets the clear code based on the code size.\n     * @param codeSize code size\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.initializeTables(int, int)",
      "begin_line": 123,
      "end_line": 137,
      "comment": "\n     * Initializes the arrays based on the maximum code size.\n     * First checks that the estimated memory usage is below memoryLimitInKb\n     *\n     * @param maxCodeSize maximum code size\n     * @param memoryLimitInKb maximum allowed estimated memory usage in Kb\n     * @throws MemoryLimitException if estimated memory usage is greater than memoryLimitInKb\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.initializeTables(int)",
      "begin_line": 143,
      "end_line": 154,
      "comment": "\n     * Initializes the arrays based on the maximum code size.\n     * @param maxCodeSize maximum code size\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 50)",
        "(line 145,col 9)-(line 145,col 41)",
        "(line 146,col 9)-(line 146,col 44)",
        "(line 147,col 9)-(line 147,col 45)",
        "(line 148,col 9)-(line 148,col 43)",
        "(line 149,col 9)-(line 149,col 31)",
        "(line 150,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.readNextCode()",
      "begin_line": 161,
      "end_line": 166,
      "comment": "\n     * Reads the next code from the stream.\n     * @return the next code\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.addEntry(int, byte, int)",
      "begin_line": 176,
      "end_line": 183,
      "comment": "\n     * Adds a new entry if the maximum table size hasn\u0027t been exceeded\n     * and returns the new index.\n     * @param previousCode the previous code\n     * @param character the character to append\n     * @param maxTableSize the maximum table size\n     * @return the new code\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.addRepeatOfPreviousCode()",
      "begin_line": 190,
      "end_line": 196,
      "comment": "\n     * Add entry for repeat of previousCode we haven\u0027t added, yet.\n     * @return new code for a repeat of the previous code\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.expandCodeToOutputStack(int, boolean)",
      "begin_line": 206,
      "end_line": 217,
      "comment": "\n     * Expands the entry with index code to the output stack and may\n     * create a new entry\n     * @param code the code\n     * @param addedUnfinishedEntry whether unfinished entries have been added\n     * @return the new location of the output stack\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 28)",
        "(line 215,col 9)-(line 215,col 65)",
        "(line 216,col 9)-(line 216,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.readFromStack(byte[], int, int)",
      "begin_line": 219,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 78)",
        "(line 221,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getCodeSize()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.resetCodeSize()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.setCodeSize(int)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.incrementCodeSize()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.resetPreviousCode()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getPrefix(int)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.setPrefix(int, int)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getPrefixesLength()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getClearCode()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.getTableSize()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.setTableSize(int)",
      "begin_line": 270,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 28)"
      ]
    }
  ]
}