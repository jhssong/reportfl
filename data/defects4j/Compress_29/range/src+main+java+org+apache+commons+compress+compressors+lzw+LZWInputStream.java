{
  "filepath": "/tmp/Compress-29b/src/main/java/org/apache/commons/compress/compressors/lzw/LZWInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LZWInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 36,
      "end_line": 181,
      "comment": "\n * \u003cp\u003eGeneric LZW implementation. It is used internally for\n * the Z decompressor and the Unshrinking Zip file compression method,\n * but may be useful for third-party projects in implementing their own LZW variations.\u003c/p\u003e\n *\n * @NotThreadSafe\n * @since 1.10\n "
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "clearCode"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeSize"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousCodeFirstChar"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousCode"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tableSize"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefixes"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "characters"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputStack"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputStackLocation"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.LZWInputStream(java.io.InputStream, java.nio.ByteOrder)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.close()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.read()",
      "begin_line": 59,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 32)",
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.read(byte[], int, int)",
      "begin_line": 68,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 51)",
        "(line 71,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 25)",
        "(line 83,col 9)-(line 83,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.decompressNextSymbol()",
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Read the next code and expand it.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.addEntry(int, byte)",
      "begin_line": 94,
      "end_line": 95,
      "comment": "\n     * Add a new entry to the dictionary.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.setClearCode(int)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Sets the clear code based on the code size.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.initializeTables(int)",
      "begin_line": 107,
      "end_line": 118,
      "comment": "\n     * Initializes the arrays based on the maximum code size.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 50)",
        "(line 109,col 9)-(line 109,col 41)",
        "(line 110,col 9)-(line 110,col 44)",
        "(line 111,col 9)-(line 111,col 45)",
        "(line 112,col 9)-(line 112,col 43)",
        "(line 113,col 9)-(line 113,col 31)",
        "(line 114,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.readNextCode()",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\n     * Reads the next code from the stream.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.addEntry(int, byte, int)",
      "begin_line": 134,
      "end_line": 141,
      "comment": "\n     * Adds a new entry if the maximum table size hasn\u0027t been exceeded\n     * and returns the new index.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.addRepeatOfPreviousCode()",
      "begin_line": 146,
      "end_line": 152,
      "comment": "\n     * Add entry for repeat of previousCode we haven\u0027t added, yet.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.expandCodeToOutputStack(int, boolean)",
      "begin_line": 158,
      "end_line": 169,
      "comment": "\n     * Expands the entry with index code to the output stack and may\n     * create a new entry\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 28)",
        "(line 167,col 9)-(line 167,col 65)",
        "(line 168,col 9)-(line 168,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzw.LZWInputStream.readFromStack(byte[], int, int)",
      "begin_line": 171,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 72)",
        "(line 173,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 17)"
      ]
    }
  ]
}