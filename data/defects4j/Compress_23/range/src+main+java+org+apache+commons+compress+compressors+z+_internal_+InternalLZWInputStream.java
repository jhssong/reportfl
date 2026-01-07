{
  "filepath": "/tmp/Compress-23b/src/main/java/org/apache/commons/compress/compressors/z/_internal_/InternalLZWInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InternalLZWInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 37,
      "end_line": 197,
      "comment": "\n * \u003cstrong\u003eThis class is only public for technical reasons and is not\n * part of Commons Compress\u0027 published API - it may change or\n * disappear without warning.\u003c/strong\u003e\n *\n * \u003cp\u003eBase-class for traditional Unix \".Z\" compression and the\n * Unshrinking method of ZIP archive.\u003c/p\u003e\n *\n * @NotThreadSafe\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "clearCode"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeSize"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bitsCached"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bitsCachedSize"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousCode"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tableSize"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefixes"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "characters"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputStack"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputStackLocation"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream.InternalLZWInputStream(java.io.InputStream)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream.close()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream.read()",
      "begin_line": 61,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 32)",
        "(line 64,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream.read(byte[], int, int)",
      "begin_line": 70,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 51)",
        "(line 73,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 25)",
        "(line 85,col 9)-(line 85,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream.decompressNextSymbol()",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Read the next code and expand it.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream.addEntry(int, byte)",
      "begin_line": 96,
      "end_line": 97,
      "comment": "\n     * Add a new entry to the dictionary.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream.setClearCode(int)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Sets the clear code based on the code size.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream.initializeTables(int)",
      "begin_line": 109,
      "end_line": 120,
      "comment": "\n     * Initializes the arrays based on the maximum code size.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 50)",
        "(line 111,col 9)-(line 111,col 41)",
        "(line 112,col 9)-(line 112,col 44)",
        "(line 113,col 9)-(line 113,col 45)",
        "(line 114,col 9)-(line 114,col 43)",
        "(line 115,col 9)-(line 115,col 31)",
        "(line 116,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream.readNextCode()",
      "begin_line": 125,
      "end_line": 139,
      "comment": "\n     * Reads the next code from the stream.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 45)",
        "(line 135,col 9)-(line 135,col 45)",
        "(line 136,col 9)-(line 136,col 33)",
        "(line 137,col 9)-(line 137,col 35)",
        "(line 138,col 9)-(line 138,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream.addEntry(int, byte, int)",
      "begin_line": 145,
      "end_line": 154,
      "comment": "\n     * Adds a new entry if the maximum table size hasn\u0027t been exceeded\n     * and returns the new index.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream.addRepeatOfPreviousCode()",
      "begin_line": 159,
      "end_line": 169,
      "comment": "\n     * Add entry for repeat of previousCode we haven\u0027t added, yet.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 32)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream.expandCodeToOutputStack(int, boolean)",
      "begin_line": 175,
      "end_line": 185,
      "comment": "\n     * Expands the entry with index code to the output stack and may\n     * create a new entry\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 28)",
        "(line 184,col 9)-(line 184,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream.readFromStack(byte[], int, int)",
      "begin_line": 187,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 72)",
        "(line 189,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 17)"
      ]
    }
  ]
}