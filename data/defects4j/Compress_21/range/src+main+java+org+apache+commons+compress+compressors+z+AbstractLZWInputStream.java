{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/compressors/z/AbstractLZWInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLZWInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 32,
      "end_line": 192,
      "comment": "\n * Base-class for traditional Unix \".Z\" compression and the\n * Unshrinking method of ZIP archive.\n * @NotThreadSafe\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "clearCode"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeSize"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bitsCached"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bitsCachedSize"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousCode"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tableSize"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefixes"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "characters"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputStack"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputStackLocation"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.z.AbstractLZWInputStream.AbstractLZWInputStream(java.io.InputStream)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.AbstractLZWInputStream.close()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.AbstractLZWInputStream.read()",
      "begin_line": 56,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 32)",
        "(line 59,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.AbstractLZWInputStream.read(byte[], int, int)",
      "begin_line": 65,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 51)",
        "(line 68,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 25)",
        "(line 80,col 9)-(line 80,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.AbstractLZWInputStream.decompressNextSymbol()",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Read the next code and expand it.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.AbstractLZWInputStream.addEntry(int, byte)",
      "begin_line": 91,
      "end_line": 92,
      "comment": "\n     * Add a new entry to the dictionary.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.AbstractLZWInputStream.setClearCode(int)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Sets the clear code based on the code size.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.AbstractLZWInputStream.initializeTables(int)",
      "begin_line": 104,
      "end_line": 115,
      "comment": "\n     * Initializes the arrays based on the maximum code size.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 50)",
        "(line 106,col 9)-(line 106,col 41)",
        "(line 107,col 9)-(line 107,col 44)",
        "(line 108,col 9)-(line 108,col 45)",
        "(line 109,col 9)-(line 109,col 43)",
        "(line 110,col 9)-(line 110,col 31)",
        "(line 111,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.AbstractLZWInputStream.readNextCode()",
      "begin_line": 120,
      "end_line": 134,
      "comment": "\n     * Reads the next code from the stream.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 45)",
        "(line 130,col 9)-(line 130,col 45)",
        "(line 131,col 9)-(line 131,col 33)",
        "(line 132,col 9)-(line 132,col 35)",
        "(line 133,col 9)-(line 133,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.AbstractLZWInputStream.addEntry(int, byte, int)",
      "begin_line": 140,
      "end_line": 149,
      "comment": "\n     * Adds a new entry if the maximum table size hasn\u0027t been exceeded\n     * and returns the new index.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.AbstractLZWInputStream.addRepeatOfPreviousCode()",
      "begin_line": 154,
      "end_line": 164,
      "comment": "\n     * Add entry for repeat of previousCode we haven\u0027t added, yet.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 32)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.AbstractLZWInputStream.expandCodeToOutputStack(int, boolean)",
      "begin_line": 170,
      "end_line": 180,
      "comment": "\n     * Expands the entry with index code to the output stack and may\n     * create a new entry\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 28)",
        "(line 179,col 9)-(line 179,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.AbstractLZWInputStream.readFromStack(byte[], int, int)",
      "begin_line": 182,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 72)",
        "(line 184,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 17)"
      ]
    }
  ]
}