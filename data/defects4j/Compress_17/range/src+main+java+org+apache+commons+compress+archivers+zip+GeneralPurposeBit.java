{
  "filepath": "/tmp/Compress-17b/src/main/java/org/apache/commons/compress/archivers/zip/GeneralPurposeBit.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeneralPurposeBit",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 171,
      "comment": "\n * Parser/encoder for the \"general purpose bit\" field in ZIP\u0027s local\n * file and central directory headers.\n * @since 1.1\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "ENCRYPTION_FLAG"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": "\n     * Indicates that the file is encrypted.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DATA_DESCRIPTOR_FLAG"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Indicates that a data descriptor stored after the file contents\n     * will hold CRC and size information.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STRONG_ENCRYPTION_FLAG"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Indicates strong encryption.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UFT8_NAMES_FLAG"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Indicates that filenames are written in utf-8.\n     *\n     * \u003cp\u003eThe only reason this is public is that {@link\n     * ZipArchiveOutputStream#EFS_FLAG} was public in Apache Commons\n     * Compress 1.0 and we needed a substitute for it.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "languageEncodingFlag"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataDescriptorFlag"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encryptionFlag"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "strongEncryptionFlag"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.GeneralPurposeBit()",
      "begin_line": 57,
      "end_line": 58,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.usesUTF8ForNames()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * whether the current entry uses UTF8 for file name and comment.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.useUTF8ForNames(boolean)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * whether the current entry will use UTF8 for file name and comment.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.usesDataDescriptor()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * whether the current entry uses the data descriptor to store CRC\n     * and size information\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.useDataDescriptor(boolean)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * whether the current entry will use the data descriptor to store\n     * CRC and size information\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.usesEncryption()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * whether the current entry is encrypted\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.useEncryption(boolean)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * whether the current entry will be encrypted\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.usesStrongEncryption()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * whether the current entry is encrypted using strong encryption\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.useStrongEncryption(boolean)",
      "begin_line": 114,
      "end_line": 119,
      "comment": "\n     * whether the current entry will be encrypted  using strong encryption\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 33)",
        "(line 116,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.encode()",
      "begin_line": 124,
      "end_line": 134,
      "comment": "\n     * Encodes the set bits in a form suitable for ZIP archives.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 133,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(byte[], int)",
      "begin_line": 141,
      "end_line": 150,
      "comment": "\n     * Parses the supported flags from the given archive data.\n     * @param data local file header or a central directory entry.\n     * @param offset offset at which the general purpose bit starts\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 71)",
        "(line 143,col 9)-(line 143,col 54)",
        "(line 144,col 9)-(line 144,col 78)",
        "(line 145,col 9)-(line 145,col 71)",
        "(line 146,col 9)-(line 147,col 36)",
        "(line 148,col 9)-(line 148,col 69)",
        "(line 149,col 9)-(line 149,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.hashCode()",
      "begin_line": 152,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 157,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.GeneralPurposeBit.equals(java.lang.Object)",
      "begin_line": 160,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 52)",
        "(line 166,col 9)-(line 169,col 58)"
      ]
    }
  ]
}