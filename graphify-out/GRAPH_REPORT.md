# Graph Report - cloudstream  (2026-09-11)

## Corpus Check
- cluster-only mode — file stats not available

## Summary
- 6412 nodes · 15458 edges · 284 communities (246 shown, 38 thin omitted)
- Extraction: 92% EXTRACTED · 8% INFERRED · 0% AMBIGUOUS · INFERRED: 1178 edges (avg confidence: 0.85)
- Token cost: 0 input · 0 output

## Graph Freshness
- Built from commit: `f725ac47`
- Run `git rev-parse HEAD` and compare to check if the graph is stale.
- Run `graphify update .` after code changes (no API cost).

## Community Hubs (Navigation)
- Community 0
- Community 1
- Community 3
- Community 4
- Community 5
- Community 6
- Community 7
- Community 8
- Community 9
- Community 10
- Community 11
- Community 12
- Community 13
- Community 14
- Community 15
- Community 16
- Community 17
- Community 18
- Community 19
- Community 20
- Community 21
- Community 22
- Community 23
- Community 24
- Community 25
- Community 26
- Community 27
- Community 28
- Community 29
- Community 30
- Community 31
- Community 32
- Community 33
- Community 34
- Community 35
- Community 36
- Community 37
- Community 38
- Community 39
- Community 40
- Community 41
- Community 42
- Community 43
- Community 44
- Community 45
- Community 46
- Community 47
- Community 48
- Community 49
- Community 50
- Community 51
- Community 52
- Community 53
- Community 54
- Community 55
- Community 56
- Community 57
- Community 58
- Community 59
- Community 60
- Community 61
- Community 62
- Community 63
- Community 64
- Community 65
- Community 66
- Community 67
- Community 68
- Community 69
- Community 70
- Community 71
- Community 72
- Community 73
- Community 74
- Community 75
- Community 76
- Community 77
- Community 78
- Community 79
- Community 80
- Community 81
- Community 82
- Community 83
- Community 84
- Community 85
- Community 86
- Community 87
- Community 88
- Community 89
- Community 90
- Community 91
- Community 92
- Community 93
- Community 94
- Community 95
- Community 96
- Community 97
- Community 98
- Community 99
- Community 100
- Community 101
- Community 102
- Community 103
- Community 104
- Community 105
- Community 106
- Community 107
- Community 108
- Community 109
- Community 110
- Community 111
- Community 112
- Community 113
- Community 114
- Community 115
- Community 116
- Community 117
- Community 118
- Community 119
- Community 120
- Community 121
- Community 122
- Community 123
- Community 124
- Community 125
- Community 126
- Community 127
- Community 128
- Community 129
- Community 130
- Community 131
- Community 132
- Community 133
- Community 134
- Community 135
- Community 136
- Community 137
- Community 138
- Community 139
- Community 140
- Community 141
- Community 142
- Community 143
- Community 144
- Community 145
- Community 146
- Community 147
- Community 148
- Community 149
- Community 150
- Community 151
- Community 152
- Community 153
- Community 154
- Community 155
- Community 156
- Community 157
- Community 158
- Community 159
- Community 160
- Community 161
- Community 162
- Community 163
- Community 164
- Community 165
- Community 166
- Community 167
- Community 168
- Community 169
- Community 170
- Community 171
- Community 172
- Community 173
- Community 174
- Community 176
- Community 177
- Community 178
- Community 179
- Community 180
- Community 181
- Community 182
- Community 183
- Community 184
- Community 185
- Community 186
- Community 187
- Community 188
- Community 189
- Community 190
- Community 191
- Community 192
- Community 193
- Community 194
- Community 195
- Community 196
- Community 197
- Community 198
- Community 199
- Community 200
- Community 201
- Community 202
- Community 203
- Community 204
- Community 205
- Community 206
- Community 207
- Community 208
- Community 209
- Community 211
- Community 212
- Community 213
- Community 214
- Community 215
- Community 216
- Community 217
- Community 218
- Community 219
- Community 220
- Community 221
- Community 222
- Community 223
- Community 224
- Community 225
- Community 226
- Community 227
- Community 228
- Community 229
- Community 230
- Community 231
- Community 232
- Community 233
- Community 234
- Community 235
- Community 237
- Community 238
- Community 239
- Community 240
- Community 241
- Community 242
- Community 243
- Community 244
- Community 245
- Community 246
- Community 247
- Community 249
- Community 250
- Community 251
- Community 252
- Community 253
- Community 254
- Community 256
- Community 258
- Community 259
- Community 260
- Community 261
- Community 262
- Community 263
- Community 266
- Community 267
- Community 268
- Community 269
- Community 270
- Community 271
- Community 274
- Community 275
- Community 279
- Community 280

## God Nodes (most connected - your core abstractions)
1. `JsInterpreterTest` - 404 edges
2. `logError()` - 225 edges
3. `ExtractorApi` - 176 edges
4. `ExtractorLink` - 150 edges
5. `newExtractorLink()` - 125 edges
6. `ViewHolderState` - 123 edges
7. `txt()` - 104 edges
8. `DataStoreHelper` - 99 edges
9. `AniListApi` - 95 edges
10. `ResultEpisode` - 94 edges

## Surprising Connections (you probably didn't know these)
- `Serializer` --inherits--> `WriteOnlySerializer`  [EXTRACTED]
  app/src/main/java/com/lagradost/cloudstream3/utils/downloader/DownloadObjects.kt → library/src/commonMain/kotlin/com/lagradost/cloudstream3/utils/serializers/WriteOnlySerializer.kt
- `CS3IPlayer` --references--> `ExtractorLink`  [EXTRACTED]
  app/src/main/java/com/lagradost/cloudstream3/ui/player/CS3IPlayer.kt → library/src/commonMain/kotlin/com/lagradost/cloudstream3/utils/ExtractorApi.kt
- `GeneratorPlayer` --references--> `ExtractorLink`  [EXTRACTED]
  app/src/main/java/com/lagradost/cloudstream3/ui/player/GeneratorPlayer.kt → library/src/commonMain/kotlin/com/lagradost/cloudstream3/utils/ExtractorApi.kt
- `PlayerGeneratorViewModel` --references--> `ExtractorLink`  [EXTRACTED]
  app/src/main/java/com/lagradost/cloudstream3/ui/player/PlayerGeneratorViewModel.kt → library/src/commonMain/kotlin/com/lagradost/cloudstream3/utils/ExtractorApi.kt
- `ResultFragmentPhone` --references--> `ExtractorLink`  [EXTRACTED]
  app/src/main/java/com/lagradost/cloudstream3/ui/result/ResultFragmentPhone.kt → library/src/commonMain/kotlin/com/lagradost/cloudstream3/utils/ExtractorApi.kt

## Import Cycles
- None detected.

## Communities (284 total, 38 thin omitted)

### Community 0 - "Community 0"
Cohesion: 0.03
Nodes (69): Blogger, ResponseSource, CloudMailRu, Embedgram, EmturbovidExtractor, Flyfile, StreamInfo, GamoVideo (+61 more)

### Community 3 - "Community 3"
Cohesion: 0.03
Nodes (73): AniListApi, AniListAvatar, AniListData, AniListFavoritesMediaConnection, AniListFavourites, AniListRoot, AniListStatusType, Completed (+65 more)

### Community 4 - "Community 4"
Cohesion: 0.05
Nodes (90): ContentX, Evoload, Evoload1, FourCX, FourPichive, FourPlayRu, Hotlinger, Pichive (+82 more)

### Community 5 - "Community 5"
Cohesion: 0.06
Nodes (25): AccountAdapter, ViewGroup, NoStateAdapter, ViewHolderState, HomeScrollAdapter, LoadResponse, ViewGroup, ViewGroup (+17 more)

### Community 6 - "Community 6"
Cohesion: 0.04
Nodes (39): Dailymotion, Geodailymotion, Metadata, Quality, SubtitleData, SubtitlesWrapper, HDMomPlayer, Track (+31 more)

### Community 7 - "Community 7"
Cohesion: 0.08
Nodes (22): CS3IPlayer, DrmMetadata, Context, FrameLayout, Interceptor, Rational, SubtitleData, SubtitleView (+14 more)

### Community 8 - "Community 8"
Cohesion: 0.07
Nodes (16): Animation, Context, MotionEvent, ValueAnimator, View, PlayerGestureHelper, ScaleGestureDetector, Animation (+8 more)

### Community 9 - "Community 9"
Cohesion: 0.48
Nodes (5): Uqload, Uqload1, Uqload2, Uqloadbz, Uqloadcx

### Community 10 - "Community 10"
Cohesion: 0.06
Nodes (20): AuthAPI, AuthPinData, AuthToken, LoginInfo, Account, ActivitiesResponse, SettingsResponse, UpdatedAt (+12 more)

### Community 11 - "Community 11"
Cohesion: 0.06
Nodes (32): SeasonData, EpisodeClickEvent, buildResultEpisode(), AutoResume, EpisodeIndexer, EpisodeRange, EpisodeSortType, DATE_NEWEST (+24 more)

### Community 12 - "Community 12"
Cohesion: 0.08
Nodes (33): APIRepository, LoadResponse, SearchResponseList, SavedLoadResponse, Cache, VideoGenerator, RepoLinkGenerator, ExtractorSubtitleLink (+25 more)

### Community 13 - "Community 13"
Cohesion: 0.09
Nodes (20): LiveData, T, observe(), observeNullable(), BaseFragment, DownloadChildFragment, Bundle, View (+12 more)

### Community 14 - "Community 14"
Cohesion: 0.17
Nodes (6): Context, getSafeSerializable(), Bundle, FragmentPlayerBinding, T, VideoGenerator

### Community 15 - "Community 15"
Cohesion: 0.05
Nodes (38): AlternativeTitles, Broadcast, Data, Genres, ListStatus, MainPicture, MalAnime, MALApi (+30 more)

### Community 16 - "Community 16"
Cohesion: 0.06
Nodes (19): Player, WeakReference, LivePreviewTimeBar, Activity, BroadcastReceiver, Context, FrameLayout, ImageView (+11 more)

### Community 18 - "Community 18"
Cohesion: 0.07
Nodes (20): ActivityMainBinding, ActivityResultLauncher, AppCompatActivity, Bundle, Configuration, Dialog, FragmentActivity, Intent (+12 more)

### Community 19 - "Community 19"
Cohesion: 0.05
Nodes (34): Data, Description, Episodes, FallbackInterceptor, Kitsu, KitsuAnimeAttributes, KitsuAnimeData, KitsuApi (+26 more)

### Community 20 - "Community 20"
Cohesion: 0.10
Nodes (17): DownloadMetaData, ByteArray, Context, CoroutineScope, DownloadStatus, IDownloadableMinimum, Job, MutableStateFlow (+9 more)

### Community 21 - "Community 21"
Cohesion: 0.09
Nodes (14): android, Bundle, Dialog, FragmentResultSwipeBinding, LoadResponse, SearchResponse, View, ResultFragmentPhone (+6 more)

### Community 23 - "Community 23"
Cohesion: 0.05
Nodes (43): AllItemsResponse, Builder, CacheFreshness, CacheTimes, OneMonth, ThirtyMinutes, Episode, EpisodeMetadata (+35 more)

### Community 24 - "Community 24"
Cohesion: 0.04
Nodes (49): TT, AMP, AND, CARET, COLON, COMMA, DOT, EOF (+41 more)

### Community 25 - "Community 25"
Cohesion: 0.06
Nodes (28): BasePreferenceFragmentCompat, SearchSuggestionApi, TmdbSearchItem, TmdbSearchResult, CustomSite, getCurrentLocale(), Context, Uri (+20 more)

### Community 26 - "Community 26"
Cohesion: 0.06
Nodes (10): AppContextUtils, Context, Fragment, HomePageList, java, SearchResponse, Spanned, AudioFocusRequest (+2 more)

### Community 27 - "Community 27"
Cohesion: 0.08
Nodes (35): ArrayLit, AssignExpr, BinExpr, BlockStmt, BoolLit, BreakSignal, BreakStmt, CallExpr (+27 more)

### Community 28 - "Community 28"
Cohesion: 0.12
Nodes (17): digitValue(), joinElement(), JsCancellationException, JsContext, JsFunction, JsInterpreter, JsList, JsObject (+9 more)

### Community 29 - "Community 29"
Cohesion: 0.07
Nodes (31): Actor, Data, Episode, ShowStatus, Completed, Ongoing, Cast, Credits (+23 more)

### Community 30 - "Community 30"
Cohesion: 0.05
Nodes (36): AbstractSubtitleEntities, SubtitleEntity, SubtitleSearch, AccountManager, AuthData, AuthLoginRequirement, AuthLoginResponse, BackupAPI (+28 more)

### Community 31 - "Community 31"
Cohesion: 0.11
Nodes (9): Child, Header, VisualDownloadCached, DeleteData, DownloadStats, DownloadViewModel, Context, LiveData (+1 more)

### Community 32 - "Community 32"
Cohesion: 0.09
Nodes (24): Player, Player, Player, Player, EmbeddedSubtitlesFetchedEvent, EpisodeSeekEvent, PauseEvent, PlayerAttachedEvent (+16 more)

### Community 33 - "Community 33"
Cohesion: 0.10
Nodes (19): TvType, Anime, AnimeMovie, AsianDrama, Audio, AudioBook, Cartoon, CustomMedia (+11 more)

### Community 34 - "Community 34"
Cohesion: 0.05
Nodes (30): VideoGenerator, VideoGenerator, ExtractorLinkGenerator, VideoGenerator, NoVideoGenerator, MinimalLinkGenerator, callback(), transformResult() (+22 more)

### Community 35 - "Community 35"
Cohesion: 0.09
Nodes (24): LoadResponse, SearchResponseList, TmdbCastMember, TmdbContentRating, TmdbContentRatings, TmdbCredits, TmdbEpisode, TmdbGenre (+16 more)

### Community 37 - "Community 37"
Cohesion: 0.09
Nodes (17): AuthLoginPage, AuthUser, AuthRepo, PlainAuthRepo, Bundle, FragmentActivity, SettingsAccount, CountDownTimer (+9 more)

### Community 38 - "Community 38"
Cohesion: 0.08
Nodes (17): AbstractSyncStatus, SearchResponse, LibraryMetadata, SyncAPI, SyncResult, SyncSearchResult, SyncStatus, Result (+9 more)

### Community 39 - "Community 39"
Cohesion: 0.11
Nodes (12): Bundle, Dialog, LayoutInflater, RecyclerView, SearchResponse, SelectData, View, ViewGroup (+4 more)

### Community 40 - "Community 40"
Cohesion: 0.08
Nodes (19): AccountHelper, Context, AccountViewModel, Context, LiveData, MutableLiveData, ViewModel, Account (+11 more)

### Community 41 - "Community 41"
Cohesion: 0.10
Nodes (14): image(), ImageParams, IPreviewGenerator, Context, CoroutineScope, Job, Uri, M3u8PreviewGenerator (+6 more)

### Community 42 - "Community 42"
Cohesion: 0.07
Nodes (12): CutoutOverlayDrawable, Activity, Bundle, Canvas, ChipGroup, Intent, Palette, View (+4 more)

### Community 43 - "Community 43"
Cohesion: 0.09
Nodes (24): HomePageResponse, HomePageList, MainPageRequest, newHomePageResponse(), Airs, Cast, Data, Ids (+16 more)

### Community 44 - "Community 44"
Cohesion: 0.08
Nodes (18): CuePointData, Flags, ByteBuffer, Extractor, ExtractorsFactory, IntArray, SubtitleParser, MatroskaSeekMap (+10 more)

### Community 45 - "Community 45"
Cohesion: 0.11
Nodes (6): AnalyticsManager, Bundle, Context, FirebaseInitializer, Context, FirebaseAnalytics

### Community 46 - "Community 46"
Cohesion: 0.08
Nodes (23): Acefile, Source, Fastream, Filegram, Element, JwPlayerHelper, Source, Track (+15 more)

### Community 47 - "Community 47"
Cohesion: 0.32
Nodes (6): CloudflareKiller, Headers, Interceptor, Request, Response, debugWarning()

### Community 48 - "Community 48"
Cohesion: 0.14
Nodes (5): BaseAdapter, RecyclerView, T, ViewGroup, S

### Community 49 - "Community 49"
Cohesion: 0.60
Nodes (5): ShaveTape, StreamTape, StreamTapeNet, StreamTapeXyz, Watchadsontape

### Community 50 - "Community 50"
Cohesion: 0.09
Nodes (7): Bundle, Configuration, Context, FragmentResultSwipeBinding, LoadResponse, SubtitleData, ResultTrailerPlayer

### Community 51 - "Community 51"
Cohesion: 0.09
Nodes (11): Maxstream, Up4FunTop, Up4Stream, Userload, AesHelper, ByteArray, Server1uns, VidStack (+3 more)

### Community 52 - "Community 52"
Cohesion: 0.14
Nodes (10): BottomSheetDialog, Bundle, LayoutInflater, SearchResponse, SearchView, View, ViewGroup, SearchFragment (+2 more)

### Community 53 - "Community 53"
Cohesion: 0.19
Nodes (8): Activity, Context, FragmentActivity, Notification, OnlinePluginData, PluginData, PluginManager, PathClassLoader

### Community 54 - "Community 54"
Cohesion: 0.09
Nodes (15): HomeFragment, RecyclerView, RecyclerView, ArrayAdapter, ArrayAdapter, BottomSheetDialog, Bundle, LayoutInflater (+7 more)

### Community 55 - "Community 55"
Cohesion: 0.07
Nodes (5): evalJs(), evalJsInternal(), jsValueToString(), CoroutineScope, CoroutineScope

### Community 56 - "Community 56"
Cohesion: 0.07
Nodes (27): FcastSession, T, Opcode, None, Pause, Ping, Play, PlaybackError (+19 more)

### Community 57 - "Community 57"
Cohesion: 0.10
Nodes (12): BaseFetchButton, DownloadMetadata, ContentLoadingProgressBar, DownloadStatusTell, FrameLayout, TextView, DownloadStatusTell, ImageView (+4 more)

### Community 58 - "Community 58"
Cohesion: 0.06
Nodes (17): AbstractPlayerFragment, Bundle, ImageView, MediaSession, SubtitleData, SubtitleView, T, View (+9 more)

### Community 59 - "Community 59"
Cohesion: 0.22
Nodes (6): CommonActivity, Activity, CastSession, Context, KeyEvent, WeakReference

### Community 60 - "Community 60"
Cohesion: 0.09
Nodes (3): Callbacks, SubtitleData, VideoSkipStamp

### Community 61 - "Community 61"
Cohesion: 0.11
Nodes (18): Activity, BottomSheetDialog, Bundle, Context, LayoutInflater, RecyclerView, SearchView, View (+10 more)

### Community 62 - "Community 62"
Cohesion: 0.11
Nodes (26): Auvexiug, Cavanhabg, CineMMRedirect, Dhcplay, Dumbalag, Guxhag, Habetar, Haxloppd (+18 more)

### Community 63 - "Community 63"
Cohesion: 0.12
Nodes (7): AtomicList, AtomicMutableList, R, T, List, MutableList, SynchronizedObject

### Community 64 - "Community 64"
Cohesion: 0.12
Nodes (14): LoadClickCallback, HeaderViewHolder, HomeParentItemAdapterPreview, Bundle, ChipGroup, Context, ImageView, LoadResponse (+6 more)

### Community 65 - "Community 65"
Cohesion: 0.08
Nodes (21): Bundle, Configuration, SearchResponse, SearchView, View, LibraryFragment, SearchView, TabLayout (+13 more)

### Community 66 - "Community 66"
Cohesion: 0.12
Nodes (8): ExpandableHomepageList, HomeViewModel, Job, LiveData, LoadResponse, MutableLiveData, SearchResponse, ViewModel

### Community 67 - "Community 67"
Cohesion: 0.15
Nodes (19): ControllerActivity, getItemIndex(), Bundle, CastSession, loadMirror(), MetadataHolder, SelectSourceController, SkipNextEpisodeController (+11 more)

### Community 68 - "Community 68"
Cohesion: 0.13
Nodes (4): SubtitleView, SaveCaptionStyle, SubtitlesFragment, CaptionStyleCompat

### Community 69 - "Community 69"
Cohesion: 0.31
Nodes (5): Activity, PendingIntent, Rational, PlayerPipHelper, RemoteAction

### Community 70 - "Community 70"
Cohesion: 0.12
Nodes (11): C, DrmInitData, HlsMultivariantPlaylist, HlsPlaylistParser, Mp4Box, ParserException, Rendition, SchemeData (+3 more)

### Community 71 - "Community 71"
Cohesion: 0.29
Nodes (3): Parser, StrLit, VarDecl

### Community 72 - "Community 72"
Cohesion: 0.10
Nodes (17): Context, IBinder, Intent, Service, PackageInstallerService, ApkInstaller, DelayedInstaller, InstallProgressStatus (+9 more)

### Community 73 - "Community 73"
Cohesion: 0.09
Nodes (6): GeneratorPlayer, Job, ValueAnimator, VideoLink, TempMetaData, DownloadEvent

### Community 74 - "Community 74"
Cohesion: 0.08
Nodes (4): IPlayer, Context, Rational, SubtitleData

### Community 75 - "Community 75"
Cohesion: 0.17
Nodes (9): CheckDuplicateData, getOptions(), getTitle(), Context, LibraryListType, BOOKMARKS, FAVORITES, SUBSCRIPTIONS (+1 more)

### Community 76 - "Community 76"
Cohesion: 0.15
Nodes (10): DownloadFileManagement, Context, SafeFile, Uri, EpisodeDownloadInstance, SubtitleData, DownloadItem, DownloadResumePackage (+2 more)

### Community 77 - "Community 77"
Cohesion: 0.10
Nodes (14): AllTransformsData, EmptyArrayData, EmptyStringData, FloatIntData, FloatLongData, MultiWriteOnly, NestedMeta, NullableFieldsData (+6 more)

### Community 78 - "Community 78"
Cohesion: 0.12
Nodes (11): ActivityOptionsCompat, Context, PlayInBrowserAction, Bundle, Context, Intent, T, VideoClickAction (+3 more)

### Community 79 - "Community 79"
Cohesion: 0.09
Nodes (20): DownloadButtonSetup, DownloadFragment, Context, TextView, View, DownloadAdapterQueue, DownloadQueueViewModel, LiveData (+12 more)

### Community 80 - "Community 80"
Cohesion: 0.15
Nodes (10): GeneratorState, Job, LiveData, SubtitleData, VideoGenerator, VideoLink, ViewModel, PlayerGeneratorViewModel (+2 more)

### Community 82 - "Community 82"
Cohesion: 0.14
Nodes (8): DefaultDiscoveryListener, NsdManager, ResolveListener, DefaultRegistrationListener, FcastManager, Context, PublicDeviceInfo, NsdServiceInfo

### Community 83 - "Community 83"
Cohesion: 0.11
Nodes (12): CloudStreamApp, ExceptionHandler, Activity, Context, Fragment, FragmentActivity, WeakReference, DownloadUtils (+4 more)

### Community 84 - "Community 84"
Cohesion: 0.24
Nodes (8): PluginWrapper, PluginViewData, Activity, Context, LiveData, ViewModel, PluginsViewModel, PluginViewDataUpdate

### Community 85 - "Community 85"
Cohesion: 0.08
Nodes (16): BaseDiffCallback, clear(), Context, DiffUtil, ImageView, newSharedPool(), ActorAdaptor, ActorData (+8 more)

### Community 86 - "Community 86"
Cohesion: 0.14
Nodes (6): SubtitleData, Language639, LanguageMetadata, SubtitleHelper, getCurrentLocale(), localizedLanguageName()

### Community 87 - "Community 87"
Cohesion: 0.11
Nodes (14): EmbedData, EmbedHelper, FileSlug, GDMirrorbot, Techinmind, AsianEmbedHelper, VstreamhubHelper, CrossMetaData (+6 more)

### Community 88 - "Community 88"
Cohesion: 0.14
Nodes (10): AccountSelectActivity, Bundle, FragmentActivity, BiometricAuthenticator, BiometricPrompt, BiometricCallback, Activity, Context (+2 more)

### Community 89 - "Community 89"
Cohesion: 0.10
Nodes (15): DownloadButton, DownloadStatusTell, TextView, CreateNotificationMetadata, DownloadCached, DownloadEpisodeCached, DownloadEpisodeMetadata, DownloadHeaderCached (+7 more)

### Community 90 - "Community 90"
Cohesion: 0.12
Nodes (12): FrameLayout, SubtitleView, PlayerSubtitleHelper, SubtitleData, SubtitleOrigin, DOWNLOADED_FILE, EMBEDDED_IN_VIDEO, URL (+4 more)

### Community 91 - "Community 91"
Cohesion: 0.12
Nodes (7): CurrentSynced, LiveData, MutableLiveData, ViewModel, SyncViewModel, ioSafe(), WorkerThread

### Community 92 - "Community 92"
Cohesion: 0.20
Nodes (13): CoroutineScope, SearchResponse, Logger, LogLevel, Error, Normal, Warning, Message (+5 more)

### Community 93 - "Community 93"
Cohesion: 0.15
Nodes (22): D0000d, D000dCom, DoodCxExtractor, DoodLaExtractor, DoodLiExtractor, DoodPmExtractor, DoodShExtractor, DoodSoExtractor (+14 more)

### Community 95 - "Community 95"
Cohesion: 0.17
Nodes (10): AnimatorListenerAdapter, EasterEggMonkeFragment, AnimatorListenerAdapter, AnimatorListenerAdapter, ImageView, Job, MotionEvent, View (+2 more)

### Community 96 - "Community 96"
Cohesion: 0.17
Nodes (4): SearchResponse, SyncSearchResultSearchResponse, SyncSearchViewModel, Score

### Community 97 - "Community 97"
Cohesion: 0.13
Nodes (11): VideoWatchState, None, Watched, DataStore, Editor, Context, KClass, KProperty (+3 more)

### Community 98 - "Community 98"
Cohesion: 0.08
Nodes (14): AniSearch, APIHolder, LoadResponse, SearchResponse, SearchResponseList, MainAPI, newSearchResponseList(), ProvidersInfoJson (+6 more)

### Community 99 - "Community 99"
Cohesion: 0.08
Nodes (25): AniSkip, AniSkipInterval, AniSkipResponse, LoadResponse, Stamp, IntroDbResponse, IntroDbSkip, LoadResponse (+17 more)

### Community 100 - "Community 100"
Cohesion: 0.06
Nodes (12): FullScreenPlayer, Activity, Bundle, Configuration, Context, Dialog, FragmentPlayerBinding, KeyEvent (+4 more)

### Community 101 - "Community 101"
Cohesion: 0.10
Nodes (10): ConstructorSupplier, ExtensionLoader, Extractor, ExtractorsFactory, SubtitleParser, Uri, UpdatedDefaultExtractorsFactory, Constructor (+2 more)

### Community 102 - "Community 102"
Cohesion: 0.20
Nodes (3): ExtractorInput, Track, TrackOutput

### Community 103 - "Community 103"
Cohesion: 0.21
Nodes (7): SingleSubtitleResource, SubtitleResource, Result, SavedResourceResponse, SavedSearchResponse, SubtitleRepo, BufferedSource

### Community 104 - "Community 104"
Cohesion: 0.17
Nodes (7): DiffCallback, DownloadAdapter, DownloadHeaderClickEvent, DiffUtil, ViewGroup, CheckBox, ViewBinding

### Community 105 - "Community 105"
Cohesion: 0.23
Nodes (5): DownloadedPlayerActivity, AppCompatActivity, Bundle, Intent, KeyEvent

### Community 106 - "Community 106"
Cohesion: 0.17
Nodes (13): Activity, BroadcastReceiver, Context, Intent, UpdateManager, BroadcastReceiver, SharedPreferences, UpdatePreferences (+5 more)

### Community 107 - "Community 107"
Cohesion: 0.20
Nodes (5): DownloadQueueWrapper, DownloadQueueManager, Context, MutableStateFlow, StateFlow

### Community 108 - "Community 108"
Cohesion: 0.09
Nodes (24): AudioFile, capitalizeString(), capitalizeStringNullable(), fixUrl(), fixUrlNull(), getRhinoContext(), imdbUrlToId(), imdbUrlToIdNullable() (+16 more)

### Community 109 - "Community 109"
Cohesion: 0.12
Nodes (15): Page, LiveData, MutableLiveData, ViewModel, LibraryViewModel, ListSorting, AlphabeticalA, AlphabeticalZ (+7 more)

### Community 110 - "Community 110"
Cohesion: 0.24
Nodes (5): ByteArray, ParsableByteArray, Track, PositionHolder, TrueHdSampleRechunker

### Community 111 - "Community 111"
Cohesion: 0.15
Nodes (14): getContext(), Interceptor, Request, Response, WebResourceRequest, WebView, WebViewClient, toRequest() (+6 more)

### Community 112 - "Community 112"
Cohesion: 0.24
Nodes (9): makeTempM3U8Intent(), Context, ViewM3U8Action, Activity, Context, Intent, VlcNightlyPackage, VlcPackage (+1 more)

### Community 113 - "Community 113"
Cohesion: 0.09
Nodes (11): Globals, View, View, SettingsFragment, Bundle, View, Bundle, View (+3 more)

### Community 114 - "Community 114"
Cohesion: 0.19
Nodes (12): ByseBuho, ByseQekaho, ByseSX, ByseVepoin, Bysezejataos, DecryptKeys, DetailsRoot, ByteArray (+4 more)

### Community 115 - "Community 115"
Cohesion: 0.16
Nodes (15): EditOp, editOpsFromCostMatrix(), EditType, DELETE, EQUAL, INSERT, KEEP, REPLACE (+7 more)

### Community 116 - "Community 116"
Cohesion: 0.14
Nodes (18): updateDurationAndPosition(), Activity, Context, Intent, MpvKtPackage, MpvKtPreviewPackage, Activity, Context (+10 more)

### Community 117 - "Community 117"
Cohesion: 0.15
Nodes (15): BaseBottomSheetDialogFragment, BaseDialogFragment, BaseFragmentHelper, Bind, BindingCreator, Inflate, Bundle, Configuration (+7 more)

### Community 118 - "Community 118"
Cohesion: 0.16
Nodes (8): Player, LiveHelper, Player, Player, WeakReference, LiveManager, LivestreamChunk, Timeline

### Community 119 - "Community 119"
Cohesion: 0.15
Nodes (9): T, ViewGroup, PriorityAdapter, SourcePriority, ViewGroup, ProfilesAdapter, Dialog, SourcePriorityDialog (+1 more)

### Community 120 - "Community 120"
Cohesion: 0.16
Nodes (12): BackupWorkManager, Context, CoroutineWorker, Result, BackupFile, BackupUtils, BackupVars, ActivityResultLauncher (+4 more)

### Community 121 - "Community 121"
Cohesion: 0.16
Nodes (11): CloudStreamPackage, Activity, Context, Intent, MinimalSubtitleLink, MinimalVideoLink, DrmExtractorLink, ExtractorLinkPlayList (+3 more)

### Community 122 - "Community 122"
Cohesion: 0.18
Nodes (8): DownloadAdapterItem, DownloadQueueAdapter, DragAndDropTouchHelper, DragAndDropTouchHelperCallback, RecyclerView, ViewGroup, DownloadQueueItemBinding, ItemTouchHelper

### Community 123 - "Community 123"
Cohesion: 0.19
Nodes (11): CustomSubripParser, ByteArray, Charset, Cue, CuesWithTiming, ParsableByteArray, Spanned, SubtitleParser (+3 more)

### Community 124 - "Community 124"
Cohesion: 0.18
Nodes (6): ChromecastSubtitlesFragment, Activity, View, SaveChromeCaptionStyle, ChromecastSubtitleSettingsBinding, DisplayMetrics

### Community 125 - "Community 125"
Cohesion: 0.13
Nodes (17): FileMoon, FileMoonIn, FileMoonSx, FilemoonV2, Ahvsh, Filesim, Guccihide, Movhide (+9 more)

### Community 126 - "Community 126"
Cohesion: 0.19
Nodes (14): DatabaseGdrive, DatabaseGdrive2, Gdriveplayer, Gdriveplayerapi, Gdriveplayerapp, Gdriveplayerbiz, Gdriveplayerco, Gdriveplayerfun (+6 more)

### Community 127 - "Community 127"
Cohesion: 0.18
Nodes (17): Captions, Cdnplayer, DBfilm, FeHD, FEmbed, Fembed9hd, FEnet, Fplayer (+9 more)

### Community 128 - "Community 128"
Cohesion: 0.16
Nodes (11): Animation, ProgressBarAnimation, AttributeSet, Bundle, Context, View, MyMiniControllerFragment, MiniControllerFragment (+3 more)

### Community 129 - "Community 129"
Cohesion: 0.20
Nodes (7): HomeChildItemAdapter, HomeScrollViewHolderState, Context, FrameLayout, SearchResponse, ViewGroup, ResumeItemAdapter

### Community 130 - "Community 130"
Cohesion: 0.15
Nodes (8): QualityDataHelper, QualityProfile, QualityProfileType, Data, Download, None, WiFi, LinkSource

### Community 131 - "Community 131"
Cohesion: 0.23
Nodes (6): ExpandableSearchList, Job, LiveData, MutableLiveData, ViewModel, SearchViewModel

### Community 132 - "Community 132"
Cohesion: 0.23
Nodes (6): AlwaysAskAction, Context, CopyClipboardAction, Context, ResultEpisode, CoroutineScope

### Community 133 - "Community 133"
Cohesion: 0.09
Nodes (18): ContentLoadingProgressBar, TextView, View, TestState, None, Running, Stopped, TestView (+10 more)

### Community 134 - "Community 134"
Cohesion: 0.24
Nodes (8): Activity, Context, Intent, OpenInAppAction, Aria2Package, Activity, Context, Intent

### Community 135 - "Community 135"
Cohesion: 0.14
Nodes (8): Context, CoroutineWorker, Result, SubscriptionWorkManager, DubStatus, Dubbed, None, Subbed

### Community 136 - "Community 136"
Cohesion: 0.14
Nodes (9): WatchType, COMPLETED, DROPPED, NONE, ONHOLD, PLANTOWATCH, WATCHING, BookmarkedData (+1 more)

### Community 137 - "Community 137"
Cohesion: 0.20
Nodes (7): setRecycledViewPool(), Bundle, SearchView, View, PluginsFragment, SearchView, FragmentPluginsBinding

### Community 138 - "Community 138"
Cohesion: 0.17
Nodes (9): DownloadType, IsDone, IsDownloading, IsFailed, IsPaused, IsPending, IsStopped, Context (+1 more)

### Community 139 - "Community 139"
Cohesion: 0.21
Nodes (6): MediaDescriptionAdapter, PlayerNotificationManager, Context, Intent, PendingIntent, Player

### Community 140 - "Community 140"
Cohesion: 0.21
Nodes (9): CoroutineScope, LiveData, ViewModel, ProviderFilter, All, Failed, Passed, TestProgress (+1 more)

### Community 141 - "Community 141"
Cohesion: 0.24
Nodes (7): BottomSheetDialog, Dialog, Spanned, View, SingleSelectionHelper, BottomInputDialogBinding, BottomSelectionDialogBinding

### Community 142 - "Community 142"
Cohesion: 0.22
Nodes (10): MetaGnathTuggers, NathanFromSubject, Simpulumlamerop, Tubeless, Urochsunloath, Voe, Voe1, Voe2 (+2 more)

### Community 143 - "Community 143"
Cohesion: 0.20
Nodes (9): PlatformContext, ImageLoader, EventListener, ByteArray, ByteBuffer, PlatformContext, Uri, ErrorResult (+1 more)

### Community 144 - "Community 144"
Cohesion: 0.16
Nodes (6): AccountSelectLinearItemDecoration, RecyclerView, View, MenuItem, NavController, Rect

### Community 145 - "Community 145"
Cohesion: 0.22
Nodes (6): Context, Repository, RepositoryManager, SitePlugin, RepositoryData, safeAsync()

### Community 146 - "Community 146"
Cohesion: 0.43
Nodes (3): View, PluginDetailsFragment, FragmentPluginDetailsBinding

### Community 147 - "Community 147"
Cohesion: 0.15
Nodes (13): CustomDecoder, CustomSubtitleDecoderFactory, DelegatingSubtitleDecoder, ByteArray, Charset, Cue, CuesWithTiming, SubtitleParser (+5 more)

### Community 148 - "Community 148"
Cohesion: 0.26
Nodes (4): Torrent, TorrentFileStat, TorrentRequest, TorrentStatus

### Community 149 - "Community 149"
Cohesion: 0.27
Nodes (6): android, LinearLayoutManager, RecyclerView, View, LinearListLayout, setLinearListLayout()

### Community 150 - "Community 150"
Cohesion: 0.29
Nodes (6): ByteArray, Rabbitstream, Sources, SourcesEncrypted, SourcesResponses, Tracks

### Community 151 - "Community 151"
Cohesion: 0.15
Nodes (9): Context, getDisplayPosition(), getWatchProgress(), Bundle, ImageView, SearchResponse, TextView, ResultFragment (+1 more)

### Community 152 - "Community 152"
Cohesion: 0.23
Nodes (7): CancellationException, Streamhub2, Upstream, Zplayer, ZplayerV2, M3u8Helper, M3u8Stream

### Community 153 - "Community 153"
Cohesion: 0.13
Nodes (10): GitInfo, GithubAsset, GithubObject, GithubRelease, GithubTag, InAppUpdater, Context, Uri (+2 more)

### Community 154 - "Community 154"
Cohesion: 0.23
Nodes (8): DownloadQueueService, Context, IBinder, Intent, MutableStateFlow, Service, StateFlow, debugAssert()

### Community 155 - "Community 155"
Cohesion: 0.24
Nodes (5): T, KClass, KProperty, T, UserPreferenceDelegate

### Community 156 - "Community 156"
Cohesion: 0.26
Nodes (7): getSafeParcelable(), T, Bundle, ViewGroup, ViewpagerAdapter, OnFlingListener, ViewpagerAdapterViewHolderState

### Community 157 - "Community 157"
Cohesion: 0.26
Nodes (9): DdosGuardKiller, Interceptor, Request, Response, getHeaders(), initClient(), Context, Headers (+1 more)

### Community 158 - "Community 158"
Cohesion: 0.14
Nodes (7): ArrayAdapter, ArrayAdapter, ImageView, SubtitleData, View, ViewGroup, SubtitleData

### Community 159 - "Community 159"
Cohesion: 0.26
Nodes (7): FocusTarget, AttributeSet, Context, ValueAnimator, View, WeakReference, TvFocus

### Community 160 - "Community 160"
Cohesion: 0.21
Nodes (8): CombinedMedia, Database, FillerEpisodeCheck, LoadResponse, MappingRoot, Season, Show, Thread

### Community 163 - "Community 163"
Cohesion: 0.30
Nodes (4): ByteArray, LazyHlsDownloadData, M3u8Helper2, TsLink

### Community 164 - "Community 164"
Cohesion: 0.19
Nodes (5): AppConfig, Activity, android, Result, OpenstreamRepoManager

### Community 165 - "Community 165"
Cohesion: 0.29
Nodes (6): AutofitRecyclerView, GrdLayoutManager, RecyclerView, View, MaxRecyclerView, GridLayoutManager

### Community 166 - "Community 166"
Cohesion: 0.27
Nodes (6): Bundle, RecyclerView, ViewGroup, ParentItemAdapter, RecyclerView, ParentItemHolder

### Community 167 - "Community 167"
Cohesion: 0.19
Nodes (5): AudioTrack, CurrentTracks, TextTrack, Track, VideoTrack

### Community 168 - "Community 168"
Cohesion: 0.18
Nodes (11): OutlineSpan, Canvas, RoundedBackgroundColorSpan, Activity, Cue, View, CharacterStyle, LineBackgroundSpan (+3 more)

### Community 169 - "Community 169"
Cohesion: 0.17
Nodes (12): CSPlayerEvent, NextEpisode, Pause, Play, PlayAsAudio, PlayPauseToggle, PrevEpisode, Restart (+4 more)

### Community 170 - "Community 170"
Cohesion: 0.18
Nodes (3): base64Decode(), ShortLink, ShortUrl

### Community 171 - "Community 171"
Cohesion: 0.60
Nodes (3): Activity, SnackbarHelper, Snackbar

### Community 172 - "Community 172"
Cohesion: 0.27
Nodes (6): FocusDirection, Down, End, Start, Up, View

### Community 173 - "Community 173"
Cohesion: 0.30
Nodes (10): BgwpCC, BigwarpArt, BigwarpIO, DesuArcg, DesuDrive, DesuOdchan, DesuOdvip, JWPlayer (+2 more)

### Community 174 - "Community 174"
Cohesion: 0.21
Nodes (6): ByteArray, IntArray, Url, Uuid, PsshAtomUtil, UrlUtil

### Community 176 - "Community 176"
Cohesion: 0.49
Nodes (9): addAdGuardDns(), addCanadianShieldDns(), addCloudFlareDns(), addDnsSbDns(), addDNSWatchDns(), addGenericDns(), addGoogleDns(), addQuad9Dns() (+1 more)

### Community 177 - "Community 177"
Cohesion: 0.24
Nodes (3): ViewGroup, SubtitleCue, SubtitleOffsetItemAdapter

### Community 178 - "Community 178"
Cohesion: 0.29
Nodes (7): FixedNextRenderersFactory, Context, Looper, NextRenderersFactory, Renderer, TextOutput, TextRenderer

### Community 179 - "Community 179"
Cohesion: 0.31
Nodes (4): Drawable, AttributeSet, Context, PercentageCropImageView

### Community 180 - "Community 180"
Cohesion: 0.20
Nodes (7): Anilist, Mal, MalSyncPage, ProviderPage, SyncPage, SyncPages, SyncUtil

### Community 181 - "Community 181"
Cohesion: 0.33
Nodes (3): Context, SearchResponse, TvChannelUtils

### Community 182 - "Community 182"
Cohesion: 0.29
Nodes (5): FlowLayout, AttributeSet, ViewGroup, LayoutParams, MarginLayoutParams

### Community 184 - "Community 184"
Cohesion: 0.27
Nodes (6): AccountData, AccountResponse, Gofile, GofileData, GofileFile, GofileResponse

### Community 185 - "Community 185"
Cohesion: 0.24
Nodes (3): Context, PlayMirrorAction, VideoGenerator

### Community 187 - "Community 187"
Cohesion: 0.24
Nodes (7): AnimeSkip, Data, Episode, Root, SearchShow, Timestamp, Type

### Community 189 - "Community 189"
Cohesion: 0.36
Nodes (4): ViewGroup, SearchHistoryAdaptor, SearchHistoryCallback, SearchHistoryItem

### Community 190 - "Community 190"
Cohesion: 0.36
Nodes (4): Bundle, View, SetupFragmentExtensions, FragmentSetupExtensionsBinding

### Community 191 - "Community 191"
Cohesion: 0.24
Nodes (3): BackPressedCallbackHelper, OnBackPressedCallback, CallbackHelper

### Community 193 - "Community 193"
Cohesion: 0.31
Nodes (3): CenterZoomLayoutManager, LinearLayoutManager, RecyclerView

### Community 194 - "Community 194"
Cohesion: 0.39
Nodes (5): DownloaderTestImpl, OkHttpClient, Request, Response, Downloader

### Community 195 - "Community 195"
Cohesion: 0.31
Nodes (4): LayoutInflater, View, ViewGroup, LoadingPosterAdapter

### Community 196 - "Community 196"
Cohesion: 0.20
Nodes (7): HDStreamAble, PeaceMakerst, PeaceResponse, Teve2ApiResponse, Teve2Link, Teve2Media, VideoSource

### Community 197 - "Community 197"
Cohesion: 0.36
Nodes (5): ExtensionsViewModel, LiveData, MutableLiveData, ViewModel, PluginStats

### Community 198 - "Community 198"
Cohesion: 0.39
Nodes (3): Context, Result, UpdateInstaller

### Community 199 - "Community 199"
Cohesion: 0.20
Nodes (10): Decoder, Encoder, KSerializer, SerialDescriptor, Uri, UriSerializer, JsonElement, JsonTransformingSerializer (+2 more)

### Community 200 - "Community 200"
Cohesion: 0.46
Nodes (4): ConsistentLiveData, LiveData, T, ResourceLiveData

### Community 201 - "Community 201"
Cohesion: 0.42
Nodes (7): JsAny, buildOptions(), getCurrentLocale(), IntlDisplayNames, localizedLanguageName(), makeDisplayNames(), navigatorLanguage()

### Community 202 - "Community 202"
Cohesion: 0.39
Nodes (3): Cda, PlayerData, VideoPlayerData

### Community 205 - "Community 205"
Cohesion: 0.40
Nodes (4): ioWorkSafe(), CoroutineScope, T, V

### Community 207 - "Community 207"
Cohesion: 0.39
Nodes (4): IBinder, Intent, Service, VideoDownloadService

### Community 208 - "Community 208"
Cohesion: 0.53
Nodes (4): LuluStream, Lulustream1, Lulustream2, Luluvdoo

### Community 209 - "Community 209"
Cohesion: 0.40
Nodes (5): Data, ItemInfo, Linkbox, Resolutions, Responses

### Community 211 - "Community 211"
Cohesion: 0.67
Nodes (3): SelectArray, SelectPopup, SelectText

### Community 213 - "Community 213"
Cohesion: 0.13
Nodes (12): Context, Palette, SearchResponse, View, SearchResultBuilder, ViewGroup, PluginAdapter, RepositoryViewHolderState (+4 more)

### Community 214 - "Community 214"
Cohesion: 0.50
Nodes (3): TauVideo, TauVideoData, TauVideoUrls

### Community 215 - "Community 215"
Cohesion: 0.36
Nodes (4): DownloadStatus, Context, DownloadStatus, UpdateDownloader

### Community 216 - "Community 216"
Cohesion: 0.43
Nodes (5): CastOptionsProvider, Context, CastOptions, OptionsProvider, SessionProvider

### Community 218 - "Community 218"
Cohesion: 0.09
Nodes (11): androidx, LoadResponse, Dialog, QualityProfileDialog, RecyclerView, DynamicString, Context, setText() (+3 more)

### Community 219 - "Community 219"
Cohesion: 0.39
Nodes (7): B, amapIndexed(), apmap(), apmapIndexed(), argamap(), R, runAllAsync()

### Community 220 - "Community 220"
Cohesion: 0.29
Nodes (6): AesData, AesHelper, ByteArray, base64DecodeArray(), base64Encode(), ByteArray

### Community 221 - "Community 221"
Cohesion: 0.32
Nodes (5): GogoHelper, GogoJsonData, GogoSource, GogoSources, Document

### Community 222 - "Community 222"
Cohesion: 0.39
Nodes (3): ExternalKeys, NewExternalKeys, WcoHelper

### Community 224 - "Community 224"
Cohesion: 0.39
Nodes (5): FloatAsIntSerializer, Decoder, Encoder, KSerializer, SerialDescriptor

### Community 225 - "Community 225"
Cohesion: 0.39
Nodes (5): FloatAsLongSerializer, Decoder, Encoder, KSerializer, SerialDescriptor

### Community 226 - "Community 226"
Cohesion: 0.39
Nodes (5): Decoder, Encoder, KSerializer, SerialDescriptor, NullableStringSerializer

### Community 227 - "Community 227"
Cohesion: 0.21
Nodes (7): ExampleInstrumentedTest, Activity, Bundle, TestApplication, FragmentResultTvBinding, FragmentSearchBinding, PersistableBundle

### Community 230 - "Community 230"
Cohesion: 0.48
Nodes (4): Activity, Context, Intent, LibreTorrentPackage

### Community 231 - "Community 231"
Cohesion: 0.48
Nodes (4): Activity, Context, Intent, WebVideoCastPackage

### Community 234 - "Community 234"
Cohesion: 0.48
Nodes (3): SSLTrustManager, X509Certificate, X509TrustManager

### Community 237 - "Community 237"
Cohesion: 0.38
Nodes (5): getSafeParcelableExtra(), BroadcastReceiver, T, registerBroadcastReceiver(), IntentFilter

### Community 238 - "Community 238"
Cohesion: 0.48
Nodes (4): Interceptor, Request, Response, WebViewResolver

### Community 239 - "Community 239"
Cohesion: 0.33
Nodes (4): GenerateGitHashTask, DefaultTask, DirectoryProperty, RegularFileProperty

### Community 242 - "Community 242"
Cohesion: 0.48
Nodes (4): BiglyBTPackage, Activity, Context, Intent

### Community 244 - "Community 244"
Cohesion: 0.48
Nodes (4): JustPlayerPackage, Activity, Context, Intent

### Community 245 - "Community 245"
Cohesion: 0.48
Nodes (4): Activity, Context, Intent, NextPlayerPackage

### Community 246 - "Community 246"
Cohesion: 0.48
Nodes (4): Activity, Context, Intent, OnlyPlayer

### Community 247 - "Community 247"
Cohesion: 0.53
Nodes (4): BroadcastReceiver, Context, Intent, VideoDownloadRestartReceiver

### Community 249 - "Community 249"
Cohesion: 0.53
Nodes (3): View, SetupFragmentLayout, FragmentSetupLayoutBinding

### Community 250 - "Community 250"
Cohesion: 0.53
Nodes (3): View, SetupFragmentMedia, FragmentSetupMediaBinding

### Community 251 - "Community 251"
Cohesion: 0.53
Nodes (3): View, SetupFragmentProviderLanguage, FragmentSetupProviderLanguagesBinding

### Community 252 - "Community 252"
Cohesion: 0.40
Nodes (3): IDisposable, IDisposableHelper, T

### Community 256 - "Community 256"
Cohesion: 0.33
Nodes (5): AutoDownloadMode, All, Disable, FilterByLang, NsfwOnly

### Community 258 - "Community 258"
Cohesion: 0.47
Nodes (4): JsonTransformSerializer, JsonElement, JsonTransformingSerializer, T

### Community 259 - "Community 259"
Cohesion: 0.47
Nodes (4): JsonElement, JsonTransformingSerializer, T, NonEmptySerializer

### Community 263 - "Community 263"
Cohesion: 0.60
Nodes (3): HomeScrollTransformer, View, ViewPager2

### Community 267 - "Community 267"
Cohesion: 0.60
Nodes (3): LinearLayoutManager, View, LinearRecycleViewLayoutManager

### Community 269 - "Community 269"
Cohesion: 0.50
Nodes (4): DownloadActionType, Pause, Resume, Stop

### Community 270 - "Community 270"
Cohesion: 0.83
Nodes (3): gradlew script, die(), warn()

## Knowledge Gaps
- **560 isolated node(s):** `Source`, `VideoResponse`, `VideoInfo`, `ResponseSource`, `Data` (+555 more)
  These have ≤1 connection - possible missing edges or undocumented components.
- **38 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `logError()` connect `Community 25` to `Community 0`, `Community 3`, `Community 4`, `Community 6`, `Community 7`, `Community 8`, `Community 11`, `Community 12`, `Community 13`, `Community 16`, `Community 18`, `Community 19`, `Community 20`, `Community 21`, `Community 23`, `Community 26`, `Community 27`, `Community 28`, `Community 29`, `Community 31`, `Community 34`, `Community 37`, `Community 40`, `Community 41`, `Community 42`, `Community 43`, `Community 45`, `Community 47`, `Community 51`, `Community 52`, `Community 53`, `Community 54`, `Community 57`, `Community 59`, `Community 61`, `Community 64`, `Community 66`, `Community 67`, `Community 69`, `Community 72`, `Community 73`, `Community 76`, `Community 78`, `Community 79`, `Community 80`, `Community 83`, `Community 85`, `Community 87`, `Community 91`, `Community 92`, `Community 97`, `Community 98`, `Community 100`, `Community 104`, `Community 108`, `Community 111`, `Community 113`, `Community 116`, `Community 117`, `Community 120`, `Community 132`, `Community 134`, `Community 135`, `Community 144`, `Community 145`, `Community 147`, `Community 148`, `Community 149`, `Community 153`, `Community 154`, `Community 158`, `Community 166`, `Community 171`, `Community 179`, `Community 180`, `Community 193`, `Community 205`, `Community 210`, `Community 218`, `Community 219`, `Community 238`, `Community 268`?**
  _High betweenness centrality (0.360) - this node is a cross-community bridge._
- **Why does `ExtractorLink` connect `Community 0` to `Community 130`, `Community 4`, `Community 6`, `Community 7`, `Community 11`, `Community 12`, `Community 142`, `Community 148`, `Community 21`, `Community 20`, `Community 152`, `Community 32`, `Community 34`, `Community 41`, `Community 173`, `Community 46`, `Community 49`, `Community 51`, `Community 185`, `Community 62`, `Community 67`, `Community 199`, `Community 72`, `Community 73`, `Community 74`, `Community 202`, `Community 76`, `Community 80`, `Community 208`, `Community 87`, `Community 218`, `Community 93`, `Community 108`, `Community 114`, `Community 243`, `Community 121`, `Community 125`, `Community 127`?**
  _High betweenness centrality (0.072) - this node is a cross-community bridge._
- **Why does `evalJsInternal()` connect `Community 55` to `Community 2`, `Community 27`, `Community 28`?**
  _High betweenness centrality (0.054) - this node is a cross-community bridge._
- **Are the 24 inferred relationships involving `newExtractorLink()` (e.g. with `.getUrl()` and `.getUrl()`) actually correct?**
  _`newExtractorLink()` has 24 INFERRED edges - model-reasoned connections that need verification._
- **What connects `Source`, `VideoResponse`, `VideoInfo` to the rest of the system?**
  _560 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `Community 0` be split into smaller, more focused modules?**
  _Cohesion score 0.028620571035431717 - nodes in this community are weakly interconnected._
- **Should `Community 1` be split into smaller, more focused modules?**
  _Cohesion score 0.013245033112582781 - nodes in this community are weakly interconnected._