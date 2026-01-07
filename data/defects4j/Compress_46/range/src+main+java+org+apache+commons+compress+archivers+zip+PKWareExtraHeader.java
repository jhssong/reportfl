{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/archivers/zip/PKWareExtraHeader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PKWareExtraHeader",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 66,
      "end_line": 308,
      "comment": "\n * Base class for all PKWare strong crypto extra headers.\n *\n * \u003cp\u003eThis base class acts as a marker so you know you can ignore all\n * extra fields that extend this class if you are not interested in\n * the meta data of PKWare strong encryption.\u003c/p\u003e\n *\n * \u003cb\u003eAlgorithm IDs\u003c/b\u003e - integer identifier of the encryption algorithm from\n * the following range\n *\n * \u003cul\u003e\n * \u003cli\u003e0x6601 - DES\u003c/li\u003e\n * \u003cli\u003e0x6602 - RC2 (version needed to extract \u0026lt; 5.2)\u003c/li\u003e\n * \u003cli\u003e0x6603 - 3DES 168\u003c/li\u003e\n * \u003cli\u003e0x6609 - 3DES 112\u003c/li\u003e\n * \u003cli\u003e0x660E - AES 128\u003c/li\u003e\n * \u003cli\u003e0x660F - AES 192\u003c/li\u003e\n * \u003cli\u003e0x6610 - AES 256\u003c/li\u003e\n * \u003cli\u003e0x6702 - RC2 (version needed to extract \u0026gt;\u003d 5.2)\u003c/li\u003e\n * \u003cli\u003e0x6720 - Blowfish\u003c/li\u003e\n * \u003cli\u003e0x6721 - Twofish\u003c/li\u003e\n * \u003cli\u003e0x6801 - RC4\u003c/li\u003e\n * \u003cli\u003e0xFFFF - Unknown algorithm\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cb\u003eHash Algorithms\u003c/b\u003e - integer identifier of the hash algorithm from the\n * following range\n *\n * \u003cul\u003e\n * \u003cli\u003e0x0000 - none\u003c/li\u003e\n * \u003cli\u003e0x0001 - CRC32\u003c/li\u003e\n * \u003cli\u003e0x8003 - MD5\u003c/li\u003e\n * \u003cli\u003e0x8004 - SHA1\u003c/li\u003e\n * \u003cli\u003e0x8007 - RIPEMD160\u003c/li\u003e\n * \u003cli\u003e0x800C - SHA256\u003c/li\u003e\n * \u003cli\u003e0x800D - SHA384\u003c/li\u003e\n * \u003cli\u003e0x800E - SHA512\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @since 1.11\n "
    },
    {
      "type": "field",
      "varNames": [
        "headerId"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localData"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Extra field data in local file data - without Header-ID or length\n     * specifier.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "centralData"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Extra field data in central directory - without Header-ID or length\n     * specifier.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.PKWareExtraHeader(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.getHeaderId()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Get the header id.\n     *\n     * @return the header id\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.setLocalFileDataData(byte[])",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Set the extra field data in the local file data - without Header-ID or\n     * length specifier.\n     *\n     * @param data\n     *            the field data to use\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.getLocalFileDataLength()",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Get the length of the local data.\n     *\n     * @return the length of the local data\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.getLocalFileDataData()",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n     * Get the local data.\n     *\n     * @return the local data\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.setCentralDirectoryData(byte[])",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Set the extra field data in central directory.\n     *\n     * @param data\n     *            the data to use\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.getCentralDirectoryLength()",
      "begin_line": 141,
      "end_line": 147,
      "comment": "\n     * Get the central data length. If there is no central data, get the local\n     * file data length.\n     *\n     * @return the central data length\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.getCentralDirectoryData()",
      "begin_line": 154,
      "end_line": 160,
      "comment": "\n     * Get the central data.\n     *\n     * @return the central data if present, else return the local file data\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 171,
      "end_line": 176,
      "comment": "\n     * @param data\n     *            the array of bytes.\n     * @param offset\n     *            the source location in the data array.\n     * @param length\n     *            the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromLocalFileData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 44)",
        "(line 174,col 9)-(line 174,col 55)",
        "(line 175,col 9)-(line 175,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 187,
      "end_line": 195,
      "comment": "\n     * @param data\n     *            the array of bytes.\n     * @param offset\n     *            the source location in the data array.\n     * @param length\n     *            the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromCentralDirectoryData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 44)",
        "(line 190,col 9)-(line 190,col 55)",
        "(line 191,col 9)-(line 191,col 37)",
        "(line 192,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeToEnum"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.EncryptionAlgorithm(int)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n         * private constructor for enum style class.\n         ",
      "child_ranges": [
        "(line 230,col 13)-(line 230,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.getCode()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n         * the algorithm id.\n         *\n         * @return the PKWare AlgorithmId\n         ",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(int)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n         * Returns the EncryptionAlgorithm for the given code or null if the\n         * method is not known.\n         * @param code the code of the algorithm\n         * @return the EncryptionAlgorithm for the given code or null\n         * if the method is not known\n         ",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 57)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeToEnum"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.HashAlgorithm(int)",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n         * private constructor for enum style class.\n         ",
      "child_ranges": [
        "(line 285,col 13)-(line 285,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getCode()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n         * the hash algorithm ID.\n         *\n         * @return the PKWare hashAlg\n         ",
      "child_ranges": [
        "(line 294,col 13)-(line 294,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(int)",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n         * Returns the HashAlgorithm for the given code or null if the method is\n         * not known.\n         * @param code the code of the algorithm\n         * @return the HashAlgorithm for the given code or null\n         * if the method is not known\n         ",
      "child_ranges": [
        "(line 305,col 13)-(line 305,col 57)"
      ]
    }
  ]
}