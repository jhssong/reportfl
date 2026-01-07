{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/compressors/deflate64/HuffmanDecoder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HuffmanDecoder",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 31,
      "end_line": 522,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RUN_LENGTH_TABLE"
      ],
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * \u003cpre\u003e\n     * --------------------------------------------------------------------\n     * idx  xtra  base     idx  xtra  base     idx  xtra  base\n     * --------------------------------------------------------------------\n     * 257   0     3       267   1   15,16     277   4   67-82\n     * 258   0     4       268   1   17,18     278   4   83-98\n     * 259   0     5       269   2   19-22     279   4   99-114\n     * 260   0     6       270   2   23-26     280   4   115-130\n     * 261   0     7       271   2   27-30     281   5   131-162\n     * 262   0     8       272   2   31-34     282   5   163-194\n     * 263   0     9       273   3   35-42     283   5   195-226\n     * 264   0     10      274   3   43-50     284   5   227-257\n     * 265   1     11,12   275   3   51-58     285   16  3\n     * 266   1     13,14   276   3   59-66\n     * --------------------------------------------------------------------\n     * \u003c/pre\u003e\n     * value \u003d (base of run length) \u003c\u003c 5 | (number of extra bits to read)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISTANCE_TABLE"
      ],
      "begin_line": 78,
      "end_line": 83,
      "comment": "\n     * \u003cpre\u003e\n     * --------------------------------------------------------------------\n     * idx  xtra  dist     idx  xtra  dist       idx  xtra  dist\n     * --------------------------------------------------------------------\n     * 0    0     1        10   4     33-48      20    9   1025-1536\n     * 1    0     2        11   4     49-64      21    9   1537-2048\n     * 2    0     3        12   5     65-96      22   10   2049-3072\n     * 3    0     4        13   5     97-128     23   10   3073-4096\n     * 4    1     5,6      14   6     129-192    24   11   4097-6144\n     * 5    1     7,8      15   6     193-256    25   11   6145-8192\n     * 6    2     9-12     16   7     257-384    26   12   8193-12288\n     * 7    2     13-16    17   7     385-512    27   12   12289-16384\n     * 8    3     17-24    18   8     513-768    28   13   16385-24576\n     * 9    3     25-32    19   8     769-1024   29   13   24577-32768\n     * 30   14   32769-49152\n     * 31   14   49153-65536\n     * --------------------------------------------------------------------\n     * \u003c/pre\u003e\n     * value \u003d (base of distance) \u003c\u003c 4 | (number of extra bits to read)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CODE_LENGTHS_ORDER"
      ],
      "begin_line": 89,
      "end_line": 90,
      "comment": "\n     * When using dynamic huffman codes the order in which the values are stored\n     * follows the positioning below\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FIXED_LITERALS"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Huffman Fixed Literal / Distance tables for mode 1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FIXED_DISTANCE"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finalBlock"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reader"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "memory"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.HuffmanDecoder(java.io.InputStream)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 70)",
        "(line 118,col 9)-(line 118,col 21)",
        "(line 119,col 9)-(line 119,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.close()",
      "begin_line": 122,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.decode(byte[])",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.decode(byte[], int, int)",
      "begin_line": 132,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.available()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DecoderState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 178,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState.state()",
      "begin_line": 179,
      "end_line": 179,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState.read(byte[], int, int)",
      "begin_line": 181,
      "end_line": 181,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState.hasData()",
      "begin_line": 183,
      "end_line": 183,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState.available()",
      "begin_line": 185,
      "end_line": 185,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "UncompressedState",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState"
      ],
      "begin_line": 188,
      "end_line": 232,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockLength"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "read"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.UncompressedState.UncompressedState(long)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 13)-(line 193,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.UncompressedState.state()",
      "begin_line": 196,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.UncompressedState.read(byte[], int, int)",
      "begin_line": 201,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 204,col 13)-(line 204,col 62)",
        "(line 205,col 13)-(line 219,col 13)",
        "(line 220,col 13)-(line 220,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.UncompressedState.hasData()",
      "begin_line": 223,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 13)-(line 225,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.UncompressedState.available()",
      "begin_line": 228,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 13)-(line 230,col 90)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InitialState",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState"
      ],
      "begin_line": 234,
      "end_line": 254,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.InitialState.state()",
      "begin_line": 235,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 237,col 13)-(line 237,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.InitialState.read(byte[], int, int)",
      "begin_line": 240,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 13)-(line 242,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.InitialState.hasData()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.InitialState.available()",
      "begin_line": 250,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 13)-(line 252,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HuffmanCodes",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState"
      ],
      "begin_line": 256,
      "end_line": 342,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "endOfBlock"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lengthTree"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "distanceTree"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runBufferPos"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runBuffer"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runBufferLength"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.HuffmanCodes.HuffmanCodes(org.apache.commons.compress.compressors.deflate64.HuffmanState, int[], int[])",
      "begin_line": 266,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 267,col 13)-(line 267,col 31)",
        "(line 268,col 13)-(line 268,col 44)",
        "(line 269,col 13)-(line 269,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.HuffmanCodes.state()",
      "begin_line": 272,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 13)-(line 274,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.HuffmanCodes.read(byte[], int, int)",
      "begin_line": 277,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 13)-(line 279,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.HuffmanCodes.decodeNext(byte[], int, int)",
      "begin_line": 282,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 283,col 13)-(line 285,col 13)",
        "(line 286,col 13)-(line 286,col 56)",
        "(line 288,col 13)-(line 317,col 13)",
        "(line 319,col 13)-(line 319,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.HuffmanCodes.copyFromRunBuffer(byte[], int, int)",
      "begin_line": 322,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 323,col 13)-(line 323,col 63)",
        "(line 324,col 13)-(line 324,col 32)",
        "(line 325,col 13)-(line 329,col 13)",
        "(line 330,col 13)-(line 330,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.HuffmanCodes.hasData()",
      "begin_line": 333,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 335,col 13)-(line 335,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.HuffmanCodes.available()",
      "begin_line": 338,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 340,col 13)-(line 340,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.nextSymbol(org.apache.commons.compress.utils.BitInputStream, org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode)",
      "begin_line": 344,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 35)",
        "(line 346,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.populateDynamicTables(org.apache.commons.compress.utils.BitInputStream, int[], int[])",
      "begin_line": 353,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 58)",
        "(line 356,col 9)-(line 356,col 45)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 361,col 68)",
        "(line 363,col 9)-(line 363,col 70)",
        "(line 365,col 9)-(line 365,col 35)",
        "(line 366,col 9)-(line 385,col 9)",
        "(line 387,col 9)-(line 387,col 69)",
        "(line 388,col 9)-(line 388,col 85)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BinaryTreeNode",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 391,
      "end_line": 419,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bits"
      ],
      "begin_line": 392,
      "end_line": 392,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "literal"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "left",
        "right"
      ],
      "begin_line": 394,
      "end_line": 394,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode.BinaryTreeNode(int)",
      "begin_line": 396,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 397,col 13)-(line 397,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode.leaf(int)",
      "begin_line": 400,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 401,col 13)-(line 401,col 29)",
        "(line 402,col 13)-(line 402,col 24)",
        "(line 403,col 13)-(line 403,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode.left()",
      "begin_line": 406,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 407,col 13)-(line 409,col 13)",
        "(line 410,col 13)-(line 410,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode.right()",
      "begin_line": 413,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 414,col 13)-(line 416,col 13)",
        "(line 417,col 13)-(line 417,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.buildTree(int[])",
      "begin_line": 421,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 48)",
        "(line 424,col 9)-(line 424,col 52)",
        "(line 426,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.getCodes(int[])",
      "begin_line": 442,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 20)",
        "(line 444,col 9)-(line 444,col 36)",
        "(line 446,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 50)",
        "(line 452,col 9)-(line 452,col 21)",
        "(line 453,col 9)-(line 453,col 42)",
        "(line 454,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 459,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DecodingMemory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 462,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "memory"
      ],
      "begin_line": 463,
      "end_line": 463,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mask"
      ],
      "begin_line": 464,
      "end_line": 464,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wHead"
      ],
      "begin_line": 465,
      "end_line": 465,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wrappedAround"
      ],
      "begin_line": 466,
      "end_line": 466,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecodingMemory.DecodingMemory()",
      "begin_line": 468,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 469,col 13)-(line 469,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecodingMemory.DecodingMemory(int)",
      "begin_line": 472,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 473,col 13)-(line 473,col 41)",
        "(line 474,col 13)-(line 474,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecodingMemory.add(byte)",
      "begin_line": 477,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 478,col 13)-(line 478,col 30)",
        "(line 479,col 13)-(line 479,col 38)",
        "(line 480,col 13)-(line 480,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecodingMemory.add(byte[], int, int)",
      "begin_line": 483,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 484,col 13)-(line 486,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecodingMemory.recordToBuffer(int, int, byte[])",
      "begin_line": 489,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 490,col 13)-(line 492,col 13)",
        "(line 493,col 13)-(line 493,col 50)",
        "(line 494,col 13)-(line 496,col 13)",
        "(line 497,col 13)-(line 499,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecodingMemory.incCounter(int)",
      "begin_line": 502,
      "end_line": 508,
      "comment": "",
      "child_ranges": [
        "(line 503,col 13)-(line 503,col 56)",
        "(line 504,col 13)-(line 506,col 13)",
        "(line 507,col 13)-(line 507,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.readBits(int)",
      "begin_line": 511,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.readBits(org.apache.commons.compress.utils.BitInputStream, int)",
      "begin_line": 515,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 42)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 17)"
      ]
    }
  ]
}