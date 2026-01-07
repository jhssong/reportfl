{
  "filepath": "/tmp/Compress-24b/src/main/java/org/apache/commons/compress/archivers/zip/GeneralPurposeBit.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeneralPurposeBit",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 209,
      "comment": "\n * Parser/encoder for the \"general purpose bit\" field in ZIP\u0027s local\n * file and central directory headers.\n * \n * @since 1.1\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "ENCRYPTION_FLAG"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * Indicates that the file is encrypted.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SLIDING_DICTIONARY_SIZE_FLAG"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Indicates the size of the sliding dictionary used by the compression method 6 (imploding).\n     * \u003cul\u003e\n     *   \u003cli\u003e0: 4096 bytes\u003c/li\u003e\n     *   \u003cli\u003e1: 8192 bytes\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_OF_SHANNON_FANO_TREES_FLAG"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Indicates the number of Shannon-Fano trees used by the compression method 6 (imploding).\n     * \u003cul\u003e\n     *   \u003cli\u003e0: 2 trees (lengths, distances)\u003c/li\u003e\n     *   \u003cli\u003e1: 3 trees (literals, lengths, distances)\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DATA_DESCRIPTOR_FLAG"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Indicates that a data descriptor stored after the file contents\n     * will hold CRC and size information.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STRONG_ENCRYPTION_FLAG"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Indicates strong encryption.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UFT8_NAMES_FLAG"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Indicates that filenames are written in UTF-8.\n     *\n     * \u003cp\u003eThe only reason this is public is that {@link\n     * ZipArchiveOutputStream#EFS_FLAG} was public in Apache Commons\n     * Compress 1.0 and we needed a substitute for it.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "languageEncodingFlag"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataDescriptorFlag"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encryptionFlag"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "strongEncryptionFlag"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "slidingDictionarySize"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numberOfShannonFanoTrees"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.GeneralPurposeBit()",
      "begin_line": 79,
      "end_line": 80,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.usesUTF8ForNames()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * whether the current entry uses UTF8 for file name and comment.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.useUTF8ForNames(boolean)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * whether the current entry will use UTF8 for file name and comment.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.usesDataDescriptor()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * whether the current entry uses the data descriptor to store CRC\n     * and size information\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.useDataDescriptor(boolean)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * whether the current entry will use the data descriptor to store\n     * CRC and size information\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.usesEncryption()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * whether the current entry is encrypted\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.useEncryption(boolean)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * whether the current entry will be encrypted\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.usesStrongEncryption()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * whether the current entry is encrypted using strong encryption\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.useStrongEncryption(boolean)",
      "begin_line": 136,
      "end_line": 141,
      "comment": "\n     * whether the current entry will be encrypted  using strong encryption\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 33)",
        "(line 138,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.getSlidingDictionarySize()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Returns the sliding dictionary size used by the compression method 6 (imploding).\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.getNumberOfShannonFanoTrees()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Returns the number of trees used by the compression method 6 (imploding).\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.encode()",
      "begin_line": 160,
      "end_line": 170,
      "comment": "\n     * Encodes the set bits in a form suitable for ZIP archives.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 169,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(byte[], int)",
      "begin_line": 178,
      "end_line": 188,
      "comment": "\n     * Parses the supported flags from the given archive data.\n     * \n     * @param data local file header or a central directory entry.\n     * @param offset offset at which the general purpose bit starts\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 71)",
        "(line 180,col 9)-(line 180,col 54)",
        "(line 181,col 9)-(line 181,col 78)",
        "(line 182,col 9)-(line 182,col 71)",
        "(line 183,col 9)-(line 183,col 82)",
        "(line 184,col 9)-(line 184,col 69)",
        "(line 185,col 9)-(line 185,col 105)",
        "(line 186,col 9)-(line 186,col 107)",
        "(line 187,col 9)-(line 187,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.hashCode()",
      "begin_line": 190,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 195,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.equals(java.lang.Object)",
      "begin_line": 198,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 52)",
        "(line 204,col 9)-(line 207,col 58)"
      ]
    }
  ]
}