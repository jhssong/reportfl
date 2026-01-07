{
  "filepath": "/tmp/Codec-17b/src/test/java/org/apache/commons/codec/language/MatchRatingApproachEncoderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatchRatingApproachEncoderTest",
      "is_interface": false,
      "parent_types": [
        "StringEncoderAbstractTest\u003cMatchRatingApproachEncoder\u003e"
      ],
      "begin_line": 35,
      "end_line": 521,
      "comment": "\n * Series of tests for the Match Rating Approach algorithm.\n *\n * General naming nomenclature for the test is of the form:\n * GeneralMetadataOnTheTestArea_ActualTestValues_ExpectedResult\n *\n * An unusual value is indicated by the term \"corner case\"\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testAccentRemoval_AllLower_SuccessfullyRemoved()",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testAccentRemoval_WithSpaces_SuccessfullyRemovedAndSpacesInvariant()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testAccentRemoval_UpperandLower_SuccessfullyRemovedAndCaseInvariant()",
      "begin_line": 49,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testAccentRemoval_MixedWithUnusualChars_SuccessfullyRemovedAndUnusualcharactersInvariant()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testAccentRemoval_GerSpanFrenMix_SuccessfullyRemoved()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testAccentRemoval_ComprehensiveAccentMix_AllSuccessfullyRemoved()",
      "begin_line": 64,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 67,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testAccentRemovalNormalString_NoChange()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 142)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testAccentRemoval_NINO_NoChange()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testAccentRemoval_NullValue_ReturnNullSuccessfully()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testRemoveSingleDoubleConsonants_BUBLE_RemovedSuccessfully()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testRemoveDoubleConsonants_MISSISSIPPI_RemovedSuccessfully()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testRemoveDoubleDoubleVowel_BEETLE_NotRemoved()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testIsVowel_CapitalA_ReturnsTrue()",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testIsVowel_SmallD_ReturnsFalse()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testRemoveVowel_ALESSANDRA_Returns_ALSSNDR()",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testRemoveVowel__AIDAN_Returns_ADN()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testRemoveVowel__DECLAN_Returns_DCLN()",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testGetFirstLast3__ALEXANDER_Returns_Aleder()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testGetFirstLast3_PETE_Returns_PETE()",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testleftTorightThenRightToLeft_ALEXANDER_ALEXANDRA_Returns4()",
      "begin_line": 135,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testleftTorightThenRightToLeft_EINSTEIN_MICHAELA_Returns0()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testGetMinRating_7_Return4_Successfully()",
      "begin_line": 145,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testGetMinRating_1_Returns5_Successfully()",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testGetMinRating_2_Returns5_Successfully()",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testgetMinRating_5_Returns4_Successfully()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testgetMinRating_5_Returns4_Successfully2()",
      "begin_line": 165,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testgetMinRating_6_Returns4_Successfully()",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testgetMinRating_7_Returns4_Successfully()",
      "begin_line": 175,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testgetMinRating_8_Returns3_Successfully()",
      "begin_line": 180,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testgetMinRating_10_Returns3_Successfully()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testgetMinRating_11_Returns_3_Successfully()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testGetMinRating_13_Returns_1_Successfully()",
      "begin_line": 195,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testcleanName_SuccessfullyClean()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testisVowel_SingleVowel_ReturnsTrue()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testisEncodeEquals_CornerCase_SecondNameNothing_ReturnsFalse()",
      "begin_line": 210,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testisEncodeEquals_CornerCase_FirstNameNothing_ReturnsFalse()",
      "begin_line": 215,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testisEncodeEquals_CornerCase_SecondNameJustSpace_ReturnsFalse()",
      "begin_line": 220,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testisEncodeEquals_CornerCase_FirstNameJustSpace_ReturnsFalse()",
      "begin_line": 225,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testisEncodeEquals_CornerCase_SecondNameNull_ReturnsFalse()",
      "begin_line": 230,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testisEncodeEquals_CornerCase_FirstNameNull_ReturnsFalse()",
      "begin_line": 235,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testisEncodeEquals_CornerCase_FirstNameJust1Letter_ReturnsFalse()",
      "begin_line": 240,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testisEncodeEqualsSecondNameJust1Letter_ReturnsFalse()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testGetEncoding_HARPER_HRPR()",
      "begin_line": 254,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testGetEncoding_SMITH_to_SMTH()",
      "begin_line": 259,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testGetEncoding_SMYTH_to_SMYTH()",
      "begin_line": 264,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testGetEncoding_Space_to_Nothing()",
      "begin_line": 269,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testGetEncoding_NoSpace_to_Nothing()",
      "begin_line": 274,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testGetEncoding_Null_to_Nothing()",
      "begin_line": 279,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testGetEncoding_One_Letter_to_Nothing()",
      "begin_line": 284,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompareNameNullSpace_ReturnsFalseSuccessfully()",
      "begin_line": 289,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompareNameSameNames_ReturnsFalseSuccessfully()",
      "begin_line": 294,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_SMITH_SMYTH_SuccessfullyMatched()",
      "begin_line": 303,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_BURNS_BOURNE_SuccessfullyMatched()",
      "begin_line": 308,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_ShortNames_AL_ED_WorksButNoMatch()",
      "begin_line": 313,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_CATHERINE_KATHRYN_SuccessfullyMatched()",
      "begin_line": 318,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_BRIAN_BRYAN_SuccessfullyMatched()",
      "begin_line": 323,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_SEAN_SHAUN_SuccessfullyMatched()",
      "begin_line": 328,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_COLM_COLIN_WithAccentsAndSymbolsAndSpaces_SuccessfullyMatched()",
      "begin_line": 333,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_STEPHEN_STEVEN_SuccessfullyMatched()",
      "begin_line": 338,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_STEVEN_STEFAN_SuccessfullyMatched()",
      "begin_line": 343,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_STEPHEN_STEFAN_SuccessfullyMatched()",
      "begin_line": 348,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_SAM_SAMUEL_SuccessfullyMatched()",
      "begin_line": 353,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_MICKY_MICHAEL_SuccessfullyMatched()",
      "begin_line": 358,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_OONA_OONAGH_SuccessfullyMatched()",
      "begin_line": 363,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_SOPHIE_SOFIA_SuccessfullyMatched()",
      "begin_line": 368,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_FRANCISZEK_FRANCES_SuccessfullyMatched()",
      "begin_line": 373,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_TOMASZ_TOM_SuccessfullyMatched()",
      "begin_line": 378,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_SmallInput_CARK_Kl_SuccessfullyMatched()",
      "begin_line": 383,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompareNameToSingleLetter_KARL_C_DoesNotMatch()",
      "begin_line": 388,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_ZACH_ZAKARIA_SuccessfullyMatched()",
      "begin_line": 393,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_KARL_ALESSANDRO_DoesNotMatch()",
      "begin_line": 398,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_Forenames_UNA_OONAGH_ShouldSuccessfullyMatchButDoesNot()",
      "begin_line": 403,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_Surname_OSULLIVAN_OSUILLEABHAIN_SuccessfulMatch()",
      "begin_line": 410,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_LongSurnames_MORIARTY_OMUIRCHEARTAIGH_DoesNotSuccessfulMatch()",
      "begin_line": 415,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_LongSurnames_OMUIRCHEARTAIGH_OMIREADHAIGH_SuccessfulMatch()",
      "begin_line": 420,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_Surname_COOPERFLYNN_SUPERLYN_SuccessfullyMatched()",
      "begin_line": 425,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_Surname_HAILEY_HALLEY_SuccessfullyMatched()",
      "begin_line": 430,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_Surname_AUERBACH_UHRBACH_SuccessfullyMatched()",
      "begin_line": 437,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_Surname_MOSKOWITZ_MOSKOVITZ_SuccessfullyMatched()",
      "begin_line": 442,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_Surname_LIPSHITZ_LIPPSZYC_SuccessfullyMatched()",
      "begin_line": 447,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_Surname_LEWINSKY_LEVINSKI_SuccessfullyMatched()",
      "begin_line": 452,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_Surname_SZLAMAWICZ_SHLAMOVITZ_SuccessfullyMatched()",
      "begin_line": 457,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_Surname_ROSOCHOWACIEC_ROSOKHOVATSETS_SuccessfullyMatched()",
      "begin_line": 462,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_Surname_PRZEMYSL_PSHEMESHIL_SuccessfullyMatched()",
      "begin_line": 467,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_PETERSON_PETERS_SuccessfullyMatched()",
      "begin_line": 474,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_MCGOWAN_MCGEOGHEGAN_SuccessfullyMatched()",
      "begin_line": 479,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_SurnamesCornerCase_MURPHY_Space_NoMatch()",
      "begin_line": 484,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_SurnamesCornerCase_MURPHY_NoSpace_NoMatch()",
      "begin_line": 489,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_SurnameCornerCase_Nulls_NoMatch()",
      "begin_line": 494,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_Surnames_MURPHY_LYNCH_NoMatchExpected()",
      "begin_line": 499,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_Forenames_SEAN_JOHN_MatchExpected()",
      "begin_line": 504,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.testCompare_Forenames_SEAN_PETE_NoMatchExpected()",
      "begin_line": 509,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoderTest.createStringEncoder()",
      "begin_line": 514,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 48)"
      ]
    }
  ]
}