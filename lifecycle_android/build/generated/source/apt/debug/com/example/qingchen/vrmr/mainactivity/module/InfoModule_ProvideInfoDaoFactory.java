// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.example.qingchen.vrmr.mainactivity.module;

import com.example.qingchen.vrmr.DataBase.InfoDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class InfoModule_ProvideInfoDaoFactory implements Factory<InfoDao> {
  private final InfoModule module;

  public InfoModule_ProvideInfoDaoFactory(InfoModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public InfoDao get() {
    return Preconditions.checkNotNull(
        module.provideInfoDao(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<InfoDao> create(InfoModule module) {
    return new InfoModule_ProvideInfoDaoFactory(module);
  }

  /** Proxies {@link InfoModule#provideInfoDao()}. */
  public static InfoDao proxyProvideInfoDao(InfoModule instance) {
    return instance.provideInfoDao();
  }
}