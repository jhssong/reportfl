{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Zip64ExtendedInformationExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 43,
      "end_line": 333,
      "comment": "\n * Holds size and other extended information for entries that use Zip64\n * features.\n *\n * \u003cp\u003eCurrently Commons Compress doesn\u0027t support encrypting the\n * central directory so the note in APPNOTE.TXT about masking doesn\u0027t\n * apply.\u003c/p\u003e\n *\n * \u003cp\u003eThe implementation relies on data being read from the local file\n * header and assumes that both size values are always present.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://www.pkware.com/documents/casestudies/APPNOTE.TXT\"\u003ePKWARE\n * APPNOTE.TXT, section 4.5.3\u003c/a\u003e\n *\n * @since 1.2\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_MUST_HAVE_BOTH_SIZES_MSG"
      ],
      "begin_line": 47,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size",
        "compressedSize",
        "relativeHeaderOffset"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "diskStart"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rawCentralDirectoryData"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Stored in {@link #parseFromCentralDirectoryData\n     * parseFromCentralDirectoryData} so it can be reused when ZipFile\n     * calls {@link #reparseCentralDirectoryData\n     * reparseCentralDirectoryData}.\n     *\n     * \u003cp\u003eNot used for anything else\u003c/p\u003e\n     *\n     * @since 1.3\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.Zip64ExtendedInformationExtraField()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * This constructor should only be used by the code that reads\n     * archives inside of Commons Compress.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.Zip64ExtendedInformationExtraField(org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Creates an extra field based on the original and compressed size.\n     *\n     * @param size the entry\u0027s original size\n     * @param compressedSize the entry\u0027s compressed size\n     *\n     * @throws IllegalArgumentException if size or compressedSize is null\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.Zip64ExtendedInformationExtraField(org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 96,
      "end_line": 104,
      "comment": "\n     * Creates an extra field based on all four possible values.\n     *\n     * @param size the entry\u0027s original size\n     * @param compressedSize the entry\u0027s compressed size\n     * @param relativeHeaderOffset the entry\u0027s offset\n     * @param diskStart the disk start\n     *\n     * @throws IllegalArgumentException if size or compressedSize is null\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 25)",
        "(line 101,col 9)-(line 101,col 45)",
        "(line 102,col 9)-(line 102,col 57)",
        "(line 103,col 9)-(line 103,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getHeaderId()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataLength()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryLength()",
      "begin_line": 114,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 118,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataData()",
      "begin_line": 121,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData()",
      "begin_line": 133,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 71)",
        "(line 135,col 9)-(line 135,col 33)",
        "(line 136,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 147,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 55)",
        "(line 160,col 9)-(line 160,col 24)",
        "(line 161,col 9)-(line 161,col 65)",
        "(line 162,col 9)-(line 162,col 24)",
        "(line 163,col 9)-(line 163,col 43)",
        "(line 164,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 176,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 51)",
        "(line 181,col 9)-(line 181,col 77)",
        "(line 189,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.reparseCentralDirectoryData(boolean, boolean, boolean, boolean)",
      "begin_line": 217,
      "end_line": 255,
      "comment": "\n     * Parses the raw bytes read from the central directory extra\n     * field with knowledge which fields are expected to be there.\n     *\n     * \u003cp\u003eAll four fields inside the zip64 extended information extra\n     * field are optional and must only be present if their corresponding\n     * entry inside the central directory contains the correct magic\n     * value.\u003c/p\u003e\n     *\n     * @param hasUncompressedSize flag to read from central directory\n     * @param hasCompressedSize flag to read from central directory\n     * @param hasRelativeHeaderOffset flag to read from central directory\n     * @param hasDiskStart flag to read from central directory\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 254,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getSize()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * The uncompressed size stored in this extra field.\n     * @return The uncompressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setSize(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * The uncompressed size stored in this extra field.\n     * @param size The uncompressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCompressedSize()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * The compressed size stored in this extra field.\n     * @return The compressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setCompressedSize(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n     * The uncompressed size stored in this extra field.\n     * @param compressedSize The uncompressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getRelativeHeaderOffset()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * The relative header offset stored in this extra field.\n     * @return The relative header offset stored in this extra field.\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setRelativeHeaderOffset(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * The relative header offset stored in this extra field.\n     * @param rho The relative header offset stored in this extra field.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getDiskStartNumber()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * The disk start number stored in this extra field.\n     * @return The disk start number stored in this extra field.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setDiskStartNumber(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * The disk start number stored in this extra field.\n     * @param ds The disk start number stored in this extra field.\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(byte[])",
      "begin_line": 321,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 20)",
        "(line 323,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 19)"
      ]
    }
  ]
}